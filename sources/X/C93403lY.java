package X;

import Y.ACListenerS36S0200000_1;
import android.text.TextUtils;
import android.view.View;
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

/* renamed from: X.3lY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93403lY extends C93423la {
    public C119624mk LJLLI;
    public TextView LJLLILLLL;
    public TextView LJLLJ;
    public TextView LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public ImageView LJLZ;
    public TuxIconView LJZ;
    public View LJZI;
    public LinearLayout LJZL;
    public C62846OlW LL;
    public final /* synthetic */ C93383lW LLD;

    @Override // X.C93423la
    public final void M() {
        this.LJZI = this.itemView.findViewById(R.id.frt);
        this.LJZL = (LinearLayout) this.itemView.findViewById(R.id.la4);
        this.LJLLL = (TextView) this.itemView.findViewById(R.id.lao);
        this.LJLZ = (ImageView) this.itemView.findViewById(R.id.ekx);
        this.LJLLLLLL = (TextView) this.itemView.findViewById(R.id.el0);
        this.LJLLI = (C119624mk) this.itemView.findViewById(R.id.acf);
        this.itemView.findViewById(R.id.n38);
        this.LJLLILLLL = (TextView) this.itemView.findViewById(R.id.gw7);
        this.LJLLJ = (TextView) this.itemView.findViewById(R.id.l0i);
        this.LJLLLL = (TextView) this.itemView.findViewById(R.id.c9f);
        this.LL = (C62846OlW) this.itemView.findViewById(R.id.b9w);
        this.LJZ = (TuxIconView) this.itemView.findViewById(R.id.dkf);
    }

    @Override // X.C93423la, X.C93523lk
    public final void init() {
        super.init();
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cl);
        if (LIZIZ != null) {
            this.itemView.setBackgroundColor(LIZIZ.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93403lY(C93383lW c93383lW, View view) {
        super(c93383lW, view);
        this.LLD = c93383lW;
    }

    @Override // X.C93423la
    public final void L(int i, IMContact contact) {
        o.LJIIIZ(contact, "contact");
        if (contact.getType() == -1) {
            return;
        }
        C93383lW c93383lW = this.LLD;
        if (c93383lW.LJLL != null) {
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(this, c93383lW, 67), this.itemView);
            C119624mk c119624mk = this.LJLLI;
            if (c119624mk != null) {
                C16880lQ.LJJJJIZL(c119624mk, new ACListenerS36S0200000_1(this, c93383lW, 68));
            }
            C62846OlW c62846OlW = this.LL;
            if (c62846OlW != null) {
                C16880lQ.LJJJJJL(c62846OlW, new ACListenerS36S0200000_1(this, c93383lW, 69));
            }
        }
        ImageView imageView = this.LJLZ;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (contact.getType() == 6 || contact.getType() == 5) {
            if (contact.getType() == 5 && TextUtils.isEmpty(this.LLD.LJLJJL)) {
                LinearLayout linearLayout = this.LJZL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TextView textView = this.LJLLL;
                if (textView != null) {
                    textView.setText(R.string.h7h);
                }
                ImageView imageView2 = this.LJLZ;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                View view = this.LJZI;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                LinearLayout linearLayout2 = this.LJZL;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                View view2 = this.LJZI;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            TextView textView2 = this.LJLLLLLL;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (contact.getType() == 0 || contact.getType() == 3) {
            if (contact.getType() == 3 && TextUtils.isEmpty(this.LLD.LJLJJL)) {
                LinearLayout linearLayout3 = this.LJZL;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                TextView textView3 = this.LJLLL;
                if (textView3 != null) {
                    textView3.setText(R.string.h7g);
                }
                ImageView imageView3 = this.LJLZ;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                View view3 = this.LJZI;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout4 = this.LJZL;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                View view4 = this.LJZI;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
            }
            C93383lW c93383lW2 = this.LLD;
            if (c93383lW2.LJLIL != 1) {
                C93533ll LLFFF = c93383lW2.LLFFF(i);
                if (LLFFF != null) {
                    if (!TextUtils.isEmpty(LLFFF.LIZIZ)) {
                        TextView textView4 = this.LJLLLLLL;
                        if (textView4 != null) {
                            textView4.setText(LLFFF.LIZIZ);
                        }
                        TextView textView5 = this.LJLLLLLL;
                        if (textView5 != null) {
                            textView5.setVisibility(0);
                        }
                    } else {
                        TextView textView6 = this.LJLLLLLL;
                        if (textView6 != null) {
                            textView6.setVisibility(8);
                        }
                    }
                }
            } else {
                TextView textView7 = this.LJLLLLLL;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
            }
        }
        if (i == 0) {
            TextView textView8 = this.LJLLL;
            if (textView8 != null) {
                textView8.setText("");
            }
            ImageView imageView4 = this.LJLZ;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        UrlModel displayAvatar = contact.getDisplayAvatar();
        if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
            C78765Uvh.LIZ(this.LJLLI, R.drawable.b0p);
        } else {
            C4AS.LJII(this.LJLLI, displayAvatar, "RelationIndexerListAdapter", null, null, 0, 0, 504);
        }
        C62846OlW c62846OlW2 = this.LL;
        if (c62846OlW2 != null) {
            c62846OlW2.setVisibility(8);
        }
        if (contact instanceof IMUser) {
            IMUser iMUser = (IMUser) contact;
            AJ9.LJ(this.itemView.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.LJLLILLLL);
            AbstractC93453ld.LLF(this.LJLLILLLL, iMUser, this.LLD.LJLJJL);
            AbstractC93453ld.LLD(this.LJLLLL, iMUser, this.LLD.LJLJJL);
            if (iMUser.getFollowStatus() == 2) {
                TuxIconView tuxIconView = this.LJZ;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                }
            } else {
                TuxIconView tuxIconView2 = this.LJZ;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
            }
            TextView textView9 = this.LJLLJ;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            C94733nh.LIZ(this.LJLLI, iMUser);
        } else if (contact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) contact;
            AJ9.LJ(this.itemView.getContext(), "", "", this.LJLLILLLL);
            TextView textView10 = this.LJLLJ;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
            TuxIconView tuxIconView3 = this.LJZ;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
            }
            int conversationMemberCount = iMConversation.getConversationMemberCount();
            String quantityString = this.itemView.getContext().getResources().getQuantityString(R.plurals.g9, conversationMemberCount, Integer.valueOf(conversationMemberCount));
            o.LJIIIIZZ(quantityString, "itemView.context.resourc…     count,\n            )");
            TextView textView11 = this.LJLLLL;
            if (textView11 != null) {
                textView11.setText(quantityString);
            }
            if (TextUtils.isEmpty(this.LLD.LJLJJL)) {
                TextView textView12 = this.LJLLILLLL;
                if (textView12 != null) {
                    textView12.setText(iMConversation.getDisplayName());
                }
            } else {
                C93383lW c93383lW3 = this.LLD;
                TextView textView13 = this.LJLLILLLL;
                String displayName = iMConversation.getDisplayName();
                String str = this.LLD.LJLJJL;
                c93383lW3.getClass();
                AbstractC93453ld.LJLZ(textView13, displayName, str, 0);
            }
        }
        C62846OlW c62846OlW3 = this.LL;
        if (c62846OlW3 != null) {
            c62846OlW3.setTag(83886080, contact);
        }
        C62846OlW c62846OlW4 = this.LL;
        if (c62846OlW4 != null) {
            c62846OlW4.setTag(50331648, 100663296);
        }
        this.itemView.setTag(83886080, contact);
        C119624mk c119624mk2 = this.LJLLI;
        if (c119624mk2 != null) {
            c119624mk2.setTag(83886080, contact);
        }
        this.itemView.setTag(50331648, 50331648);
        C119624mk c119624mk3 = this.LJLLI;
        if (c119624mk3 != null) {
            c119624mk3.setTag(50331648, 50331649);
        }
    }
}
