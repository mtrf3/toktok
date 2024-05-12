package X;

import Y.ACListenerS21S0100000_1;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;

/* renamed from: X.3la, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C93423la extends C93523lk<IMContact> {
    public C119624mk LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public TuxIconView LJLJJL;
    public C71897SJp LJLJJLL;
    public View LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final /* synthetic */ AbstractC93453ld LJLL;

    public void M() {
        this.LJLJL = this.itemView.findViewById(R.id.frt);
        this.LJLIL = (C119624mk) this.itemView.findViewById(R.id.acf);
        this.LJLJJLL = (C71897SJp) this.itemView.findViewById(R.id.b_o);
        this.LJLILLLLZI = (TextView) this.itemView.findViewById(R.id.gw7);
        this.LJLJI = (TextView) this.itemView.findViewById(R.id.c9f);
        this.LJLJJL = (TuxIconView) this.itemView.findViewById(R.id.dkf);
        this.LJLJJI = (TextView) this.itemView.findViewById(R.id.lao);
        this.itemView.findViewById(R.id.n38);
    }

    @Override // X.C93523lk
    public void init() {
        M();
        View view = this.itemView;
        view.setBackground(C89953fz.LIZ(view.getContext()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93423la(AbstractC93453ld abstractC93453ld, final View view) {
        new RecyclerView.ViewHolder(view) { // from class: X.3lk
            public void init() {
                throw null;
            }

            {
                init();
            }
        };
        this.LJLL = abstractC93453ld;
        view.setTag(this);
        this.LJLJLJ = Math.round(KL2.LIZJ(EF7.LIZIZ(), 16.0f));
        this.LJLJLLL = ((int) KL2.LIZJ(EF7.LIZIZ(), -32)) - 1;
    }

    public void L(int i, IMContact iMContact) {
        int i2;
        if (iMContact.getType() == -1) {
            return;
        }
        C71897SJp c71897SJp = this.LJLJJLL;
        if (c71897SJp != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c71897SJp.getLayoutParams();
            AbstractC93453ld abstractC93453ld = this.LJLL;
            if (abstractC93453ld.LJLJJI) {
                if (abstractC93453ld.LJLJJLL.contains(iMContact)) {
                    this.LJLJJLL.setChecked(true);
                } else {
                    this.LJLJJLL.setChecked(false);
                }
                int marginStart = marginLayoutParams.getMarginStart();
                int i3 = this.LJLJLJ;
                if (marginStart != i3) {
                    marginLayoutParams.setMargins(i3, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    marginLayoutParams.setMarginStart(this.LJLJLJ);
                    this.LJLJJLL.setLayoutParams(marginLayoutParams);
                }
            } else {
                this.LJLJJLL.setChecked(false);
                int marginStart2 = marginLayoutParams.getMarginStart();
                int i4 = this.LJLJLLL;
                if (marginStart2 != i4) {
                    marginLayoutParams.setMargins(i4, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    marginLayoutParams.setMarginStart(this.LJLJLLL);
                    this.LJLJJLL.setLayoutParams(marginLayoutParams);
                }
            }
        }
        if (this.LJLJL != null && this.LJLJJI != null) {
            if (iMContact.getType() == 2) {
                this.LJLJJI.setText(R.string.h8e);
                this.LJLJJI.setVisibility(0);
                this.LJLJL.setVisibility(8);
            } else if (iMContact.getType() == 3) {
                View view = this.LJLJL;
                if (i == 0) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
                this.LJLJJI.setText(R.string.h7d);
                this.LJLJJI.setVisibility(0);
            } else {
                this.LJLJJI.setVisibility(8);
                this.LJLJL.setVisibility(8);
            }
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            if (this.LJLIL != null) {
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    C78765Uvh.LIZ(this.LJLIL, R.drawable.b0p);
                } else {
                    C4AS.LIZJ(this.LJLIL, displayAvatar, "AbsRelationListAdapter");
                }
            }
            IMUser LIZ = C81573Ib.LIZ(iMContact);
            if (this.LJLILLLLZI != null && this.LJLJI != null) {
                if (LIZ != null) {
                    AJ9.LJ(this.itemView.getContext(), LIZ.getCustomVerify(), LIZ.getEnterpriseVerifyReason(), this.LJLILLLLZI);
                    AbstractC93453ld.LLF(this.LJLILLLLZI, LIZ, this.LJLL.LJLJJL);
                    if (!TextUtils.isEmpty(this.LJLL.LJLLLLLL(iMContact)) && !TextUtils.isEmpty(this.LJLL.LJLJJL)) {
                        AbstractC93453ld.LLD(this.LJLJI, LIZ, this.LJLL.LJLJJL);
                    } else if (TextUtils.isEmpty(this.LJLL.LJLLLLLL(iMContact))) {
                        this.LJLJI.setVisibility(8);
                    } else {
                        this.LJLJI.setVisibility(0);
                        this.LJLJI.setText(this.LJLL.LJLLLLLL(iMContact));
                    }
                    if (C36L.LIZJ(LIZ)) {
                        this.LJLJJL.setVisibility(8);
                    } else if (LIZ.getFollowStatus() == 2) {
                        this.LJLJJL.setVisibility(0);
                    } else {
                        this.LJLJJL.setVisibility(8);
                    }
                } else {
                    AJ9.LJ(this.itemView.getContext(), "", "", this.LJLILLLLZI);
                    this.LJLJI.setVisibility(8);
                    this.LJLJJL.setVisibility(8);
                    if (TextUtils.isEmpty(this.LJLL.LJLJJL)) {
                        this.LJLILLLLZI.setText(iMContact.getDisplayName());
                    } else {
                        AbstractC93453ld abstractC93453ld2 = this.LJLL;
                        TextView textView = this.LJLILLLLZI;
                        String displayName = iMContact.getDisplayName();
                        String str = this.LJLL.LJLJJL;
                        abstractC93453ld2.getClass();
                        AbstractC93453ld.LJLZ(textView, displayName, str, 0);
                    }
                }
            }
        }
        if (this.LJLL.LJLL != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 233), this.itemView);
        }
        C119624mk c119624mk = this.LJLIL;
        if (c119624mk != null) {
            c119624mk.setTag(50331648, 50331649);
            this.LJLIL.setTag(83886080, iMContact);
        }
        this.itemView.setTag(50331648, 50331648);
        this.itemView.setTag(83886080, iMContact);
    }
}
