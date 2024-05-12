package X;

import Y.ARunnableS37S0100000_1;
import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS70S0100000_1;
import Y.IDrS41S0100000_1;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93453ld extends AbstractC029409q<C93423la> {
    public int LJLIL;
    public boolean LJLJJI;
    public String LJLJJL;
    public RecyclerView LJLJL;
    public LinearLayoutManager LJLJLJ;
    public ARunnableS37S0100000_1 LJLJLLL;
    public C93293lN LJLL;
    public IDrS41S0100000_1 LJLLI;
    public final IDAListenerS70S0100000_1 LJLLILLLL = new IDAListenerS70S0100000_1(this, 13);
    public boolean LJLILLLLZI = false;
    public final List<IMContact> LJLJI = new ArrayList();
    public LinkedHashSet<IMContact> LJLJJLL = new LinkedHashSet<>();

    public abstract String LJLLLLLL(IMContact iMContact);

    @Override // X.AbstractC029409q
    public int getItemCount() {
        List<IMContact> list = this.LJLJI;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return 0;
        }
        return ((ArrayList) this.LJLJI).size();
    }

    public void LJZ(int i) {
        notifyItemChanged(i);
    }

    public final void LL(List<IMContact> list) {
        this.LJLJJL = null;
        ((ArrayList) this.LJLJI).clear();
        this.LJLIL = 0;
        ((ArrayList) this.LJLJI).addAll(list);
        if (((ArrayList) this.LJLJI).isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            ((ArrayList) this.LJLJI).add(iMUser);
        } else {
            if (((ArrayList) this.LJLJI).size() == 1 && ((IMContact) ListProtector.get(this.LJLJI, 0)).getType() == -1) {
                return;
            }
            if (((IMContact) ListProtector.get(this.LJLJI, 0)).getType() == -1) {
                ListProtector.remove(this.LJLJI, 0);
            }
        }
        notifyDataSetChanged();
    }

    public final void LLFF(boolean z) {
        if (this.LJLJJI != z) {
            this.LJLJJI = z;
            if (!z) {
                this.LJLJJLL.clear();
            }
            AnimatorSet.Builder builder = null;
            if (this.LJLJJI) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.LJLJLJ == null) {
                    return;
                }
                for (int i = 0; i < this.LJLJLJ.LJJJI(); i++) {
                    View LJJJ = this.LJLJLJ.LJJJ(i);
                    if (LJJJ != null) {
                        C93423la c93423la = (C93423la) LJJJ.getTag();
                        if (builder == null) {
                            ValueAnimator ofInt = ValueAnimator.ofInt(c93423la.LJLJLLL, c93423la.LJLJLJ);
                            ofInt.addUpdateListener(new AUListenerS90S0100000_1(c93423la, 82));
                            builder = animatorSet.play(ofInt);
                        } else {
                            ValueAnimator ofInt2 = ValueAnimator.ofInt(c93423la.LJLJLLL, c93423la.LJLJLJ);
                            ofInt2.addUpdateListener(new AUListenerS90S0100000_1(c93423la, 82));
                            builder.with(ofInt2);
                        }
                    }
                }
                animatorSet.setDuration(300L);
                animatorSet.addListener(this.LJLLILLLL);
                animatorSet.start();
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            for (int i2 = 0; i2 < this.LJLJLJ.LJJJI(); i2++) {
                View LJJJ2 = this.LJLJLJ.LJJJ(i2);
                if (LJJJ2 != null) {
                    C93423la c93423la2 = (C93423la) LJJJ2.getTag();
                    if (builder == null) {
                        ValueAnimator ofInt3 = ValueAnimator.ofInt(c93423la2.LJLJLJ, c93423la2.LJLJLLL);
                        ofInt3.addUpdateListener(new AUListenerS90S0100000_1(c93423la2, 83));
                        builder = animatorSet2.play(ofInt3);
                    } else {
                        ValueAnimator ofInt4 = ValueAnimator.ofInt(c93423la2.LJLJLJ, c93423la2.LJLJLLL);
                        ofInt4.addUpdateListener(new AUListenerS90S0100000_1(c93423la2, 83));
                        builder.with(ofInt4);
                    }
                }
            }
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(this.LJLLILLLL);
            animatorSet2.start();
        }
    }

    @Override // X.AbstractC029409q
    public int getItemViewType(int i) {
        if (((IMContact) ListProtector.get(this.LJLJI, i)).getType() == -1) {
            return -1;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJL = recyclerView;
        this.LJLJLJ = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (this.LJLLI == null) {
            this.LJLLI = new IDrS41S0100000_1(this, 11);
        }
        this.LJLJL.LJIIJJI(this.LJLLI);
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLJL = null;
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJZI, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C93423la c93423la, int i) {
        c93423la.L(i, (IMContact) ListProtector.get(this.LJLJI, i));
    }

    public C93423la LJZL(int i, ViewGroup viewGroup) {
        int i2;
        LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.b5i;
        } else {
            i2 = R.layout.b5c;
        }
        return new C93423la(this, C16880lQ.LLLLIILL(LLZIL, i2, viewGroup, false));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public C93423la com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C93423la LJZL = LJZL(i, viewGroup);
        C0AX.LIZ(viewGroup, LJZL.itemView, R.id.lj7);
        View view = LJZL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LJZL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJZL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LJZL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LJZL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJZL.getClass().getName();
        return LJZL;
    }

    public static final void LLD(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(iMUser.getDisplayName())) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setText(iMUser.getDisplayName());
                textView.setVisibility(0);
                return;
            }
        }
        if (iMUser.getSearchType() == 5) {
            if (TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setVisibility(8);
            } else {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
            }
        } else if (iMUser.getSearchType() == 3) {
            if (TextUtils.isEmpty(iMUser.getRemarkName())) {
                if (TextUtils.isEmpty(iMUser.getSignature())) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                }
            } else {
                String string = EF7.LIZIZ().getResources().getString(R.string.h7l, iMUser.getNickName());
                str = C78897Uxp.LJIIL(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
                LJLZ(textView, string, str, 3);
                textView.setVisibility(0);
            }
        } else {
            String str2 = "";
            if (iMUser.getSearchType() == 1) {
                String displayId = iMUser.getDisplayId();
                String lowerCase = C78897Uxp.LJJIII(displayId).toLowerCase();
                if (!TextUtils.isEmpty(displayId)) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < displayId.length(); i++) {
                        sb.append(C73030SlO.LJIIL(displayId.charAt(i)).charAt(0));
                    }
                    str2 = sb.toString();
                }
                str = C78897Uxp.LJIIL(displayId, lowerCase, str2, str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(EF7.LIZIZ().getResources().getString(R.string.h3j));
                LIZ.append(displayId);
                LJLZ(textView, X1D.LIZIZ(LIZ), str, 4);
                textView.setVisibility(0);
            } else if (iMUser.getSearchType() == 2) {
                str = C78897Uxp.LJIIL(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
                LJLZ(textView, "", str, 6);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(iMUser.getDisplayName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(iMUser.getDisplayName());
        textView.setVisibility(0);
        LJLZ(textView, iMUser.getDisplayName(), str, 0);
    }

    public static final void LLF(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayId());
        } else {
            LJLZ(textView, iMUser.getDisplayId(), str, 0);
        }
    }

    public static void LJLZ(TextView textView, String str, String str2, int i) {
        int indexOf = str.toLowerCase(Locale.getDefault()).indexOf(str2.toLowerCase(Locale.getDefault()), i);
        if (indexOf != -1) {
            str2 = str.substring(indexOf, Math.min(str2.length() + indexOf, str.length()));
        }
        textView.setText(C93593lr.LIZ(C79045V0n.LJI(R.attr.eb, textView.getContext()).intValue(), i, str, str2));
    }
}
