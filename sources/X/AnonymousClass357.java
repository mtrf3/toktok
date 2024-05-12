package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.357, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass357 {
    public final C2UZ LIZ;
    public final View.OnClickListener LIZIZ;
    public final InterfaceC88471Ynr<String, Integer, C76800UCe> LIZJ;
    public final InterfaceC88473Ynt<UserRecommendationContent.RecUserInfo, Integer, Integer, C76800UCe> LIZLLL;
    public final TuxIconView LJ;
    public final SmartAvatarImageView LJFF;
    public final TuxTextView LJI;
    public final C58049MqL LJII;
    public final RelationButton LJIIIIZZ;
    public UserRecommendationContent.RecUserInfo LJIIIZ;

    public AnonymousClass357(C2UZ root, View.OnClickListener onClickListener, C76272z1 c76272z1, C76282z2 c76282z2) {
        o.LJIIIZ(root, "root");
        o.LJIIIZ(onClickListener, "onClickListener");
        this.LIZ = root;
        this.LIZIZ = onClickListener;
        this.LIZJ = c76272z1;
        this.LIZLLL = c76282z2;
        root.setTag(this);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cn);
        c110614Vt.LIZJ = C61328O5c.LIZJ(10);
        Context context = root.getContext();
        o.LJIIIIZZ(context, "root.context");
        root.setBackground(c110614Vt.LIZ(context));
        root.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
        TuxIconView tuxIconView = (TuxIconView) root.findViewById(R.id.bfh);
        if (tuxIconView != null) {
            tuxIconView.setTag(this);
            C16880lQ.LJJJ(tuxIconView, onClickListener);
        } else {
            tuxIconView = null;
        }
        this.LJ = tuxIconView;
        this.LJFF = (SmartAvatarImageView) root.findViewById(R.id.ad0);
        this.LJI = (TuxTextView) root.findViewById(R.id.n1e);
        this.LJII = (C58049MqL) root.findViewById(R.id.iuj);
        this.LJIIIIZZ = (RelationButton) root.findViewById(R.id.iuh);
    }
}
