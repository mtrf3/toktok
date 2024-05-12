package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftSender;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3gF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90113gF extends AbstractC029409q<AbstractC90133gH<?>> {
    public final List<Object> LJLIL = new ArrayList();
    public boolean LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLIL, i);
        if (obj instanceof GiftSender) {
            return 0;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        if (obj instanceof String) {
            return 2;
        }
        throw new IllegalArgumentException(KMP.LJ("Invalid type of data ", i));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC90133gH<?> abstractC90133gH, int i) {
        String str;
        UrlModel avatarThumb;
        List<String> urlList;
        AbstractC90133gH<?> holder = abstractC90133gH;
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLIL, i);
        if (holder instanceof C90123gG) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.supporterpanel.GiftSender");
            GiftSender giftSender = (GiftSender) obj;
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) holder.itemView.findViewById(R.id.dvv);
            TextView textView = (TextView) holder.itemView.findViewById(R.id.dw1);
            TextView textView2 = (TextView) holder.itemView.findViewById(R.id.bml);
            String str2 = null;
            if (smartAvatarImageView != null) {
                User user = giftSender.user;
                if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
                    str = (String) ListProtector.get(urlList, 0);
                } else {
                    str = null;
                }
                smartAvatarImageView.setImageURI(str);
            }
            if (textView != null) {
                User user2 = giftSender.user;
                if (user2 != null) {
                    str2 = user2.getUniqueId();
                }
                textView.setText(str2);
            }
            if (textView2 != null) {
                textView2.setText(giftSender.commentText);
            }
            C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS21S0100000_1(giftSender, 257));
            return;
        }
        if (holder instanceof C90153gJ) {
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Any");
            ((C223338pd) holder.itemView.findViewById(R.id.dw_)).LIZIZ();
        } else {
            if (holder instanceof C90143gI) {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Any");
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC90133gH<?> com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC90133gH<?> abstractC90133gH;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    final View view = C28289B8j.LIZ(parent, R.layout.pw, parent, false);
                    o.LJIIIIZZ(view, "view");
                    abstractC90133gH = new AbstractC90133gH<Object>(view) { // from class: X.3gI
                    };
                } else {
                    throw new IllegalArgumentException("Invalid view type");
                }
            } else {
                final View view2 = C28289B8j.LIZ(parent, R.layout.px, parent, false);
                o.LJIIIIZZ(view2, "view");
                abstractC90133gH = new AbstractC90133gH<Object>(view2) { // from class: X.3gJ
                };
            }
        } else {
            final View view3 = C28289B8j.LIZ(parent, R.layout.q8, parent, false);
            o.LJIIIIZZ(view3, "view");
            abstractC90133gH = new AbstractC90133gH<GiftSender>(view3) { // from class: X.3gG
            };
        }
        C0AX.LIZ(parent, abstractC90133gH.itemView, R.id.lj7);
        View view4 = abstractC90133gH.itemView;
        if (view4 != null) {
            view4.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (abstractC90133gH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(abstractC90133gH.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) abstractC90133gH.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(abstractC90133gH.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = abstractC90133gH.getClass().getName();
        return abstractC90133gH;
    }
}
