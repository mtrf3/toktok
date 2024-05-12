package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93413lZ extends C93423la {
    public C119624mk LJLLI;
    public TextView LJLLILLLL;
    public TextView LJLLJ;
    public TextView LJLLL;
    public TextView LJLLLL;
    public ImageView LJLLLLLL;
    public TuxIconView LJLZ;
    public View LJZ;
    public LinearLayout LJZI;
    public final /* synthetic */ C93373lV LJZL;

    @Override // X.C93423la
    public final void M() {
        super.M();
        this.LJZ = this.itemView.findViewById(R.id.frt);
        this.LJZI = (LinearLayout) this.itemView.findViewById(R.id.la4);
        this.LJLLJ = (TextView) this.itemView.findViewById(R.id.lao);
        this.LJLLLLLL = (ImageView) this.itemView.findViewById(R.id.ekx);
        this.LJLLLL = (TextView) this.itemView.findViewById(R.id.el0);
        this.LJLJJLL = (C71897SJp) this.itemView.findViewById(R.id.b_o);
        this.LJLLI = (C119624mk) this.itemView.findViewById(R.id.acf);
        this.itemView.findViewById(R.id.n38);
        this.LJLLILLLL = (TextView) this.itemView.findViewById(R.id.gw7);
        this.LJLLL = (TextView) this.itemView.findViewById(R.id.c9f);
        this.LJLZ = (TuxIconView) this.itemView.findViewById(R.id.dkf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93413lZ(C93373lV c93373lV, View view) {
        super(c93373lV, view);
        this.LJZL = c93373lV;
    }

    @Override // X.C93423la
    public final void L(int i, IMContact contact) {
        String str;
        Context context;
        Resources resources;
        int i2;
        int i3;
        o.LJIIIZ(contact, "contact");
        if (contact.getType() == -1) {
            return;
        }
        C71897SJp c71897SJp = this.LJLJJLL;
        int i4 = 0;
        if (c71897SJp != null) {
            ViewGroup.LayoutParams layoutParams = c71897SJp.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C93373lV c93373lV = this.LJZL;
            if (c93373lV.LJLJJI) {
                C71897SJp c71897SJp2 = this.LJLJJLL;
                if (c71897SJp2 != null) {
                    c71897SJp2.setChecked(c93373lV.LJLJJLL.contains(contact));
                }
                int marginStart = marginLayoutParams.getMarginStart();
                int i5 = this.LJLJLJ;
                if (marginStart != i5) {
                    marginLayoutParams.setMarginStart(i5);
                    marginLayoutParams.setMargins(this.LJLJLJ, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    C71897SJp c71897SJp3 = this.LJLJJLL;
                    if (c71897SJp3 != null) {
                        c71897SJp3.setLayoutParams(marginLayoutParams);
                    }
                }
            } else {
                C71897SJp c71897SJp4 = this.LJLJJLL;
                if (c71897SJp4 != null) {
                    c71897SJp4.setSelected(false);
                }
                int marginStart2 = marginLayoutParams.getMarginStart();
                int i6 = this.LJLJLLL;
                if (marginStart2 != i6) {
                    marginLayoutParams.setMarginStart(i6);
                    marginLayoutParams.setMargins(this.LJLJLLL, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    C71897SJp c71897SJp5 = this.LJLJJLL;
                    if (c71897SJp5 != null) {
                        c71897SJp5.setLayoutParams(marginLayoutParams);
                    }
                }
            }
        }
        UrlModel displayAvatar = contact.getDisplayAvatar();
        if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
            C78765Uvh.LIZ(this.LJLLI, R.drawable.b0p);
        } else {
            C4AS.LJII(this.LJLLI, displayAvatar, "RelationIndexSelectListAdapter", null, null, 0, 0, 504);
        }
        ImageView imageView = this.LJLLLLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (contact.getType() == 1 || contact.getType() == 2) {
            if (contact.getType() == 2 && TextUtils.isEmpty(this.LJZL.LJLJJL)) {
                TextView textView = this.LJLLJ;
                if (textView != null) {
                    textView.setText(R.string.h8e);
                }
                LinearLayout linearLayout = this.LJZI;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = this.LJZI;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            View view = this.LJZ;
            if (view != null) {
                view.setVisibility(8);
            }
            TextView textView2 = this.LJLLLL;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (contact.getType() == 6 || contact.getType() == 5) {
            if (contact.getType() == 5 && TextUtils.isEmpty(this.LJZL.LJLJJL)) {
                LinearLayout linearLayout3 = this.LJZI;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                TextView textView3 = this.LJLLJ;
                if (textView3 != null) {
                    textView3.setText(R.string.h7h);
                }
                View view2 = this.LJZ;
                if (view2 != null) {
                    if (i == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    view2.setVisibility(i2);
                }
            } else {
                LinearLayout linearLayout4 = this.LJZI;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                View view3 = this.LJZ;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            String str2 = LLFFF(i).LIZIZ;
            if (this.LJZL.LJLILLLLZI && !TextUtils.isEmpty(str2)) {
                TextView textView4 = this.LJLLLL;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                TextView textView5 = this.LJLLLL;
                if (textView5 != null) {
                    textView5.setText(str2);
                }
            } else {
                TextView textView6 = this.LJLLLL;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
            }
        } else if (contact.getType() == 0 || contact.getType() == 3) {
            if (contact.getType() == 3 && TextUtils.isEmpty(this.LJZL.LJLJJL)) {
                LinearLayout linearLayout5 = this.LJZI;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
                TextView textView7 = this.LJLLJ;
                if (textView7 != null) {
                    textView7.setText(R.string.h7g);
                }
                View view4 = this.LJZ;
                if (view4 != null) {
                    if (i == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    view4.setVisibility(i3);
                }
            } else {
                LinearLayout linearLayout6 = this.LJZI;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(8);
                }
                View view5 = this.LJZ;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
            C93373lV c93373lV2 = this.LJZL;
            if (c93373lV2.LJLIL != 1) {
                C93533ll LLFFF = c93373lV2.LLFFF(i);
                if (!TextUtils.isEmpty(LLFFF.LIZIZ)) {
                    TextView textView8 = this.LJLLLL;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                    }
                    TextView textView9 = this.LJLLLL;
                    if (textView9 != null) {
                        textView9.setText(LLFFF.LIZIZ);
                    }
                } else {
                    TextView textView10 = this.LJLLLL;
                    if (textView10 != null) {
                        textView10.setVisibility(8);
                    }
                }
            } else {
                TextView textView11 = this.LJLLLL;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
            }
        }
        if (i == 0) {
            TextView textView12 = this.LJLLJ;
            if (textView12 != null) {
                textView12.setText("");
            }
            ImageView imageView2 = this.LJLLLLLL;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (contact instanceof IMUser) {
            IMUser iMUser = (IMUser) contact;
            AJ9.LJ(this.itemView.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.LJLLILLLL);
            C94733nh.LIZ(this.LJLLI, iMUser);
            AbstractC93453ld.LLF(this.LJLLILLLL, iMUser, this.LJZL.LJLJJL);
            AbstractC93453ld.LLD(this.LJLLL, iMUser, this.LJZL.LJLJJL);
            TuxIconView tuxIconView = this.LJLZ;
            if (tuxIconView != null) {
                if (iMUser.getFollowStatus() != 2) {
                    i4 = 8;
                }
                tuxIconView.setVisibility(i4);
            }
        } else if (contact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) contact;
            AJ9.LJ(this.itemView.getContext(), "", "", this.LJLLILLLL);
            int conversationMemberCount = iMConversation.getConversationMemberCount();
            TextView textView13 = this.LJLLL;
            if (textView13 != null && (context = textView13.getContext()) != null && (resources = context.getResources()) != null) {
                str = resources.getQuantityString(R.plurals.g9, conversationMemberCount, Integer.valueOf(conversationMemberCount));
            } else {
                str = null;
            }
            TextView textView14 = this.LJLLL;
            if (textView14 != null) {
                textView14.setText(str);
            }
            TuxIconView tuxIconView2 = this.LJLZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.LJZL.LJLJJL)) {
                TextView textView15 = this.LJLLILLLL;
                if (textView15 != null) {
                    textView15.setText(iMConversation.getDisplayName());
                }
            } else {
                C93373lV c93373lV3 = this.LJZL;
                TextView textView16 = this.LJLLILLLL;
                String displayName = iMConversation.getDisplayName();
                String str3 = this.LJZL.LJLJJL;
                c93373lV3.getClass();
                AbstractC93453ld.LJLZ(textView16, displayName, str3, 0);
            }
        }
        C93373lV c93373lV4 = this.LJZL;
        if (c93373lV4.LJLL != null) {
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(this, c93373lV4, 65), this.itemView);
            C119624mk c119624mk = this.LJLLI;
            if (c119624mk != null) {
                C16880lQ.LJJJJIZL(c119624mk, new ACListenerS36S0200000_1(this, this.LJZL, 66));
            }
        }
        this.itemView.setTag(50331648, 50331648);
        this.itemView.setTag(83886080, contact);
        C119624mk c119624mk2 = this.LJLLI;
        if (c119624mk2 != null) {
            c119624mk2.setTag(50331648, 50331649);
        }
        C119624mk c119624mk3 = this.LJLLI;
        if (c119624mk3 != null) {
            c119624mk3.setTag(83886080, contact);
        }
    }
}
