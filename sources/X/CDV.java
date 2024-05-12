package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.CommunityContent;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailAboutMeSetting;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class CDV extends CDI {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final C47061t0 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C47121t6 LJLJJLL;
    public final C47121t6 LJLJL;
    public final LiveIconView LJLJLJ;
    public final LiveIconView LJLJLLL;
    public final /* synthetic */ CDG LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDV(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh3, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLL = cdg;
        this.LJLIL = 2;
        this.LJLILLLLZI = "&";
        this.LJLJI = (C47061t0) this.itemView.findViewById(R.id.a1p);
        this.LJLJJI = (C47061t0) this.itemView.findViewById(R.id.my0);
        this.LJLJJL = (C47121t6) this.itemView.findViewById(R.id.mo6);
        this.LJLJJLL = (C47121t6) this.itemView.findViewById(R.id.mlt);
        this.LJLJL = (C47121t6) this.itemView.findViewById(R.id.lyr);
        this.LJLJLJ = (LiveIconView) this.itemView.findViewById(R.id.aw1);
        this.LJLJLLL = (LiveIconView) this.itemView.findViewById(R.id.ay8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, java.lang.String] */
    @Override // X.CDI
    public final void L(CDI holder, int i) {
        ImageModel imageModel;
        ViewTreeObserver viewTreeObserver;
        int i2;
        CommunityDetail communityDetail;
        List<CommunityContent> list;
        User user;
        o.LJIIIZ(holder, "holder");
        BQO LIZ = C15650jR.LIZ();
        GetSubPrivilegeDetailResponse.Data data = this.LJLL.LJLJI;
        User user2 = null;
        if (data != null && (user = data.anchorDetail) != null) {
            imageModel = user.getAvatarMedium();
        } else {
            imageModel = null;
        }
        LIZ.LJIIIZ(imageModel).LJIIJJI(this.LJLJI);
        if (this.LJLL.LJLIL.LJLJL) {
            C47061t0 c47061t0 = this.LJLJJI;
            if (c47061t0 != null) {
                c47061t0.setVisibility(8);
            }
        } else {
            C47061t0 c47061t02 = this.LJLJJI;
            if (c47061t02 != null) {
                c47061t02.setVisibility(0);
            }
            C15650jR.LIZ().LJIIIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb()).LJIIJJI(this.LJLJJI);
        }
        LiveIconView liveIconView = this.LJLJLLL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this.LJLL, 351));
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        GetSubPrivilegeDetailResponse.Data data2 = this.LJLL.LJLJI;
        if (data2 != null && (communityDetail = data2.communityDetail) != null && (list = communityDetail.communityContentList) != null) {
            for (CommunityContent communityContent : list) {
                if (communityContent.communityContentType == 1) {
                    c68322mC.element = communityContent.communityContentText;
                }
            }
        }
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 != null) {
            Object[] objArr = new Object[1];
            GetSubPrivilegeDetailResponse.Data data3 = this.LJLL.LJLJI;
            if (data3 != null) {
                user2 = data3.anchorDetail;
            }
            objArr[0] = C05170If.LIZ(user2);
            c47121t6.setText(C15380j0.LJIILL(R.string.oh2, objArr));
        }
        GetSubPrivilegeDetailResponse.Data data4 = this.LJLL.LJLJI;
        if (data4 == null || (i2 = data4.subscriberCount) < 5) {
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                c47121t62.setVisibility(8);
            }
        } else {
            C47121t6 c47121t63 = this.LJLJJLL;
            if (c47121t63 != null) {
                c47121t63.setVisibility(0);
            }
            C47121t6 c47121t64 = this.LJLJJLL;
            if (c47121t64 != null) {
                c47121t64.setText(C15380j0.LJIILL(R.string.oh3, Integer.valueOf(i2)));
            }
        }
        if (((CharSequence) c68322mC.element).length() == 0 || LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE.enableAboutMe()) {
            C47121t6 c47121t65 = this.LJLJL;
            if (c47121t65 != null) {
                c47121t65.setVisibility(8);
            }
            LiveIconView liveIconView2 = this.LJLJLJ;
            if (liveIconView2 == null) {
                return;
            }
            liveIconView2.setVisibility(8);
            return;
        }
        C47121t6 c47121t66 = this.LJLJL;
        if (c47121t66 != null) {
            c47121t66.setVisibility(0);
        }
        C47121t6 c47121t67 = this.LJLJL;
        if (c47121t67 != null) {
            c47121t67.setMaxLines(this.LJLIL);
        }
        LiveIconView liveIconView3 = this.LJLJLJ;
        if (liveIconView3 != null) {
            liveIconView3.setVisibility(8);
        }
        C47121t6 c47121t68 = this.LJLJL;
        if (c47121t68 != null) {
            c47121t68.setText((CharSequence) c68322mC.element);
        }
        LiveIconView liveIconView4 = this.LJLJLJ;
        if (liveIconView4 != null) {
            C16880lQ.LJJII(liveIconView4, new ACListenerS40S0200000_5(c68322mC, this, 58));
        }
        M(this.LJLJL, (String) c68322mC.element);
        C47121t6 c47121t69 = this.LJLJL;
        if (c47121t69 == null || (viewTreeObserver = c47121t69.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new CDW(this, c68322mC));
    }

    public final void M(C47121t6 c47121t6, String str) {
        Layout layout;
        int ellipsisCount;
        int length;
        int i;
        if (c47121t6 == null || (layout = c47121t6.getLayout()) == null || (ellipsisCount = layout.getEllipsisCount(layout.getLineCount() - 1)) <= 0 || (length = str.length() - ellipsisCount) < 3) {
            return;
        }
        CharSequence subSequence = str.subSequence(0, length - 3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) subSequence);
        LIZ.append(this.LJLILLLLZI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c47121t6.setText(LIZIZ);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        LiveIconView liveIconView = this.LJLJLJ;
        if (liveIconView != null) {
            liveIconView.setVisibility(0);
            if (CCJ.LIZ(c47121t6.getContext())) {
                i = -1;
            } else {
                i = -2;
            }
            boolean baseIsLeftToRight = new Bidi(LIZIZ, i).baseIsLeftToRight();
            AnonymousClass064 LIZ2 = C57396Mfo.LIZ(constraintLayout);
            LIZ2.LJI(liveIconView.getId(), 1);
            LIZ2.LJI(liveIconView.getId(), 2);
            LIZ2.LJI(liveIconView.getId(), 6);
            LIZ2.LJI(liveIconView.getId(), 7);
            if (baseIsLeftToRight) {
                LIZ2.LJIIIIZZ(liveIconView.getId(), 2, c47121t6.getId(), 2);
            } else {
                LIZ2.LJIIIIZZ(liveIconView.getId(), 1, c47121t6.getId(), 1);
            }
            LIZ2.LIZIZ(constraintLayout);
        }
    }
}
