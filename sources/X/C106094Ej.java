package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106094Ej extends AbstractC029409q<AbstractC106224Ew> {
    public final Fragment LJLIL;
    public final C99033ud LJLILLLLZI;
    public final List<ActionBarButtonConf> LJLJI;
    public final HashSet<ActionBarButtonConf> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public final void LJLZ(List<ActionBarButtonConf> oldList) {
        o.LJIIIZ(oldList, "oldList");
        this.LJLJJL = LJLLLLLL(this.LJLIL.getContext(), this.LJLJI);
        if (oldList.size() != ((ArrayList) this.LJLJI).size()) {
            notifyDataSetChanged();
            return;
        }
        int size = ((ArrayList) this.LJLJI).size();
        for (int i = 0; i < size; i++) {
            if (!o.LJ(ListProtector.get(oldList, i), ListProtector.get(this.LJLJI, i))) {
                notifyItemChanged(i);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Integer type;
        ActionBarButtonConf actionBarButtonConf = (ActionBarButtonConf) ORZ.LJLLLLLL(i, this.LJLJI);
        if (actionBarButtonConf != null && (type = actionBarButtonConf.getType()) != null) {
            return type.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(AbstractC106224Ew abstractC106224Ew) {
        ActionBarButtonConf actionBarButtonConf;
        AbstractC106224Ew holder = abstractC106224Ew;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (!ORZ.LJLJJI(holder.LJLIL, this.LJLJJI) && (actionBarButtonConf = holder.LJLIL) != null && actionBarButtonConf.isShow()) {
            holder.L();
            HashSet<ActionBarButtonConf> hashSet = this.LJLJJI;
            ActionBarButtonConf actionBarButtonConf2 = holder.LJLIL;
            if (actionBarButtonConf2 == null) {
                return;
            }
            hashSet.add(actionBarButtonConf2);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(AbstractC106224Ew holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
    }

    public C106094Ej(Fragment fragment, C99033ud sessionInfo) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LJLIL = fragment;
        this.LJLILLLLZI = sessionInfo;
        this.LJLJI = new ArrayList();
        this.LJLJJI = new HashSet<>();
    }

    public final int LJLLLLLL(Context context, List<ActionBarButtonConf> list) {
        int LJJIIZI;
        boolean z;
        EnumC106114El enumC106114El;
        int LJJIIZI2;
        int LJJIIZI3;
        String string;
        if (context == null) {
            return 0;
        }
        int LJIIIIZZ = C60996Nwm.LJIIIIZZ(context);
        int LJJIIZI4 = C78685UuP.LJJIIZI(R.dimen.sx, context) * 2;
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActionBarButtonConf actionBarButtonConf = (ActionBarButtonConf) it.next();
            if (LJJIIZI4 >= LJIIIIZZ) {
                return 0;
            }
            if (actionBarButtonConf.isShow()) {
                int LIZ = (C106244Ey.LIZ() * 2) + LJJIIZI4;
                String title = actionBarButtonConf.getTitle();
                if (title == null || title.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C74247TBz c74247TBz = new C74247TBz();
                    c74247TBz.LIZLLL(actionBarButtonConf.getTitle());
                    c74247TBz.LIZJ(51);
                    LJJIIZI4 = c74247TBz.LIZ().getWidth() + LIZ;
                } else {
                    LJJIIZI4 = LIZ;
                }
                C106254Ez c106254Ez = EnumC106114El.Companion;
                Integer type = actionBarButtonConf.getType();
                if (type != null) {
                    int intValue = type.intValue();
                    c106254Ez.getClass();
                    switch (intValue) {
                        case 1:
                            enumC106114El = EnumC106114El.NORMAL_EMOJI;
                            break;
                        case 2:
                            enumC106114El = EnumC106114El.STICKER;
                            break;
                        case 3:
                            enumC106114El = EnumC106114El.ANIMATED_EMOJI;
                            break;
                        case 4:
                            enumC106114El = EnumC106114El.VIDEO_SHARE;
                            break;
                        case 5:
                            enumC106114El = EnumC106114El.NUDGE;
                            break;
                        case 6:
                            enumC106114El = EnumC106114El.NUDGE_BACK;
                            break;
                        case 7:
                            enumC106114El = EnumC106114El.STICKER_STORE;
                            break;
                        case 8:
                            enumC106114El = EnumC106114El.SUGGESTED_QUERY;
                            break;
                        case 9:
                            enumC106114El = EnumC106114El.SUGGESTED_REPLY;
                            break;
                        default:
                            enumC106114El = EnumC106114El.UNKNOWN;
                            break;
                    }
                    int i = C106124Em.LIZ[enumC106114El.ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Context context2 = this.LJLIL.getContext();
                                if (context2 != null && (string = context2.getString(R.string.rnm)) != null) {
                                    C74247TBz c74247TBz2 = new C74247TBz();
                                    c74247TBz2.LIZLLL(string);
                                    c74247TBz2.LIZJ(51);
                                    LJJIIZI4 += c74247TBz2.LIZ().getWidth();
                                }
                                LJJIIZI2 = C78685UuP.LJJIIZI(R.dimen.sv, context) + LJJIIZI4;
                                LJJIIZI3 = C78685UuP.LJJIIZI(R.dimen.st, context);
                            }
                        } else {
                            LJJIIZI2 = C78685UuP.LJJIIZI(R.dimen.sv, context) + LJJIIZI4;
                            LJJIIZI3 = C78685UuP.LJJIIZI(R.dimen.st, context);
                        }
                    } else {
                        LJJIIZI2 = C78685UuP.LJJIIZI(R.dimen.sz, context) + LJJIIZI4;
                        LJJIIZI3 = C78685UuP.LJJIIZI(R.dimen.st, context);
                    }
                    LJJIIZI4 = LJJIIZI3 + LJJIIZI2;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (((ActionBarButtonConf) it2.next()).isShow() && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
            if (i2 == 0 || (LJJIIZI = (C78685UuP.LJJIIZI(R.dimen.ss, context) * i2) + LJJIIZI4) >= LJIIIIZZ) {
                return 0;
            }
            int i3 = LJIIIIZZ - LJJIIZI;
            int i4 = (i3 / i2) / 2;
            this.LJLJJLL = i3 - ((i2 * 2) * i4);
            return Math.min(i4, C78685UuP.LJJIIZI(R.dimen.sw, context));
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x015f, code lost:
    
        if (r2.intValue() != r1) goto L33;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.AbstractC106224Ew r32, int r33) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106094Ej.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC106224Ew com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        LayoutInflater LLZIL;
        o.LJIIIZ(parent, "parent");
        Fragment fragment = this.LJLIL;
        C99033ud sessionInfo = this.LJLILLLLZI;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        boolean z = true;
        if (i == EnumC106114El.VIDEO_SHARE.getValue() || i == EnumC106114El.STICKER_STORE.getValue()) {
            i2 = R.layout.b2o;
        } else if (i == EnumC106114El.NUDGE.getValue() || i == EnumC106114El.NUDGE_BACK.getValue() || i == EnumC106114El.STICKER.getValue()) {
            i2 = R.layout.b2p;
        } else {
            i2 = R.layout.b2q;
        }
        if (!C77357UXp.LJJIIJZLJL()) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parentView.context");
            LLZIL = new C105524Ce(context);
        } else {
            LLZIL = C16880lQ.LLZIL(parent.getContext());
        }
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i2, parent, false);
        LLLLIILL.setBackgroundResource(R.drawable.bfx);
        C106104Ek c106104Ek = new C106104Ek(fragment, LLLLIILL, sessionInfo);
        C0AX.LIZ(parent, c106104Ek.itemView, R.id.lj7);
        View view = c106104Ek.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c106104Ek.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C106104Ek.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c106104Ek.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c106104Ek.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C106104Ek.class.getName();
        return c106104Ek;
    }
}
