package X;

import Y.ACListenerS23S0201000_5;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS430S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class BI8 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC88473Ynt<GameTag, Integer, Boolean, C76800UCe> LJLIL;
    public GameTag LJLILLLLZI;
    public final List<GameTag> LJLJI;
    public final LiveEditText LJLJJI;
    public final boolean LJLJJL;
    public final List<PartnershipGameEvent> LJLJJLL;
    public List<GameTag> LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;

    public final boolean LJLLLLLL() {
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            return this.LJLJLLL;
        }
        return true;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i = 0;
        if (LJLLLLLL()) {
            List<GameTag> list = this.LJLJL;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
        List<GameTag> list2 = this.LJLJL;
        if (list2 != null) {
            i = list2.size();
        }
        return i + 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (LJLLLLLL() || i != 0) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        GameTag gameTag;
        String str;
        boolean z;
        int i2;
        PartnershipGameEvent partnershipGameEvent;
        int LJJLIIIJILLIZJL;
        int i3;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof BIG) {
            BIG big = (BIG) holder;
            int adapterPosition = big.getAdapterPosition();
            List<GameTag> list = this.LJLJL;
            if (list != null) {
                if (LJLLLLLL()) {
                    i3 = adapterPosition;
                } else {
                    i3 = adapterPosition - 1;
                }
                gameTag = (GameTag) ORZ.LJLLLLLL(i3, list);
            } else {
                gameTag = null;
            }
            String searchContent = this.LJLJLJ;
            o.LJIIIZ(searchContent, "searchContent");
            if (gameTag == null || (str = gameTag.showName) == null) {
                str = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (C29306Beo.LJIJJLI(searchContent) && str.length() > 0 && (LJJLIIIJILLIZJL = s.LJJLIIIJILLIZJL(0, str, searchContent, true)) >= 0) {
                if (LJJLIIIJILLIZJL > 0) {
                    C23010vJ.LJFF(spannableStringBuilder, 0, LJJLIIIJILLIZJL, 34, 600);
                }
                C23010vJ.LJFF(spannableStringBuilder, searchContent.length() + LJJLIIIJILLIZJL, str.length(), 34, 600);
            }
            big.LJLILLLLZI.setText(spannableStringBuilder);
            if (gameTag != null) {
                z = gameTag.getSelected();
            } else {
                z = false;
            }
            big.LJLILLLLZI.setSelected(z);
            C47121t6 c47121t6 = big.LJLILLLLZI;
            if (z) {
                i2 = R.style.a45;
            } else {
                i2 = R.style.a43;
            }
            c47121t6.LJJIJIL(i2);
            List<PartnershipGameEvent> list2 = this.LJLJJLL;
            if (list2 != null) {
                Iterator<PartnershipGameEvent> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        partnershipGameEvent = it.next();
                        PartnershipGameEvent partnershipGameEvent2 = partnershipGameEvent;
                        if (gameTag != null) {
                            long j = partnershipGameEvent2.gameTagId;
                            Long l = gameTag.id;
                            if (l != null && j == l.longValue()) {
                                break;
                            }
                        }
                    } else {
                        partnershipGameEvent = null;
                        break;
                    }
                }
                PartnershipGameEvent partnershipGameEvent3 = partnershipGameEvent;
                if (partnershipGameEvent3 != null) {
                    big.L(true, partnershipGameEvent3);
                    C16880lQ.LJIIJ(new ACListenerS23S0201000_5(adapterPosition, this, gameTag, 2), holder.itemView);
                    return;
                }
            }
            big.L(false, null);
            C16880lQ.LJIIJ(new ACListenerS23S0201000_5(adapterPosition, this, gameTag, 2), holder.itemView);
            return;
        }
        if (holder instanceof BI7) {
            BI7 bi7 = (BI7) holder;
            List<GameTag> list3 = this.LJLJL;
            if (list3 != null && C78934UyQ.LJIJJLI(list3)) {
                bi7.LJLIL.setText(C15380j0.LJIILJJIL(R.string.mkk));
            } else {
                bi7.LJLIL.setText(C15380j0.LJIILJJIL(R.string.mkm));
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder big;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            View view = C28289B8j.LIZ(parent, R.layout.cx1, parent, false);
            o.LJIIIIZZ(view, "view");
            big = new BI7(view);
        } else {
            View view2 = C28289B8j.LIZ(parent, R.layout.d3w, parent, false);
            o.LJIIIIZZ(view2, "view");
            big = new BIG(view2);
        }
        C0AX.LIZ(parent, big.itemView, R.id.lj7);
        View view3 = big.itemView;
        if (view3 != null) {
            view3.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (big.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(big.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) big.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(big.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = big.getClass().getName();
        return big;
    }

    public BI8(IDqS430S0100000_5 selectCallback, GameTag gameTag, List list, LiveEditText liveEditText, boolean z, List list2) {
        o.LJIIIZ(selectCallback, "selectCallback");
        this.LJLIL = selectCallback;
        this.LJLILLLLZI = gameTag;
        this.LJLJI = list;
        this.LJLJJI = liveEditText;
        this.LJLJJL = z;
        this.LJLJJLL = list2;
        this.LJLJL = list;
        this.LJLJLJ = "";
    }
}
