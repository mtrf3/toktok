package X;

import Y.ACListenerS25S0100000_5;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.CommunityContent;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class CDO extends CDI {
    public final C47121t6 LJLIL;
    public final C47061t0 LJLILLLLZI;
    public final LiveIconView LJLJI;
    public final /* synthetic */ CDG LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDO(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dgq, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = cdg;
        this.LJLIL = (C47121t6) this.itemView.findViewById(R.id.m2v);
        this.LJLILLLLZI = (C47061t0) this.itemView.findViewById(R.id.f51);
        this.LJLJI = (LiveIconView) this.itemView.findViewById(R.id.ay8);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        CommunityDetail communityDetail;
        List<CommunityContent> list;
        ViewGroup.LayoutParams layoutParams;
        CommunityDetail communityDetail2;
        List<CommunityContent> list2;
        o.LJIIIZ(holder, "holder");
        LiveIconView liveIconView = this.LJLJI;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this.LJLJJI, 349));
        }
        GetSubPrivilegeDetailResponse.Data data = this.LJLJJI.LJLJI;
        String str = "";
        if (data != null && (communityDetail2 = data.communityDetail) != null && (list2 = communityDetail2.communityContentList) != null) {
            for (CommunityContent communityContent : list2) {
                if (communityContent.communityContentType == 1) {
                    str = communityContent.communityContentText;
                }
            }
        }
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            c47121t6.setText(str);
        }
        GetSubPrivilegeDetailResponse.Data data2 = this.LJLJJI.LJLJI;
        ImageModel imageModel = null;
        if (data2 != null && (communityDetail = data2.communityDetail) != null && (list = communityDetail.communityContentList) != null) {
            for (CommunityContent communityContent2 : list) {
                if (communityContent2.communityContentType == 2) {
                    imageModel = communityContent2.communityContentImage;
                }
            }
            if (imageModel != null) {
                C47061t0 c47061t0 = this.LJLILLLLZI;
                if (c47061t0 != null && (layoutParams = c47061t0.getLayoutParams()) != null) {
                    int LJIIL = C15380j0.LJIIL() - C15380j0.LIZ(56.0f);
                    layoutParams.width = LJIIL;
                    layoutParams.height = (int) ((LJIIL / 312.0f) * 143);
                    C47061t0 c47061t02 = this.LJLILLLLZI;
                    if (c47061t02 != null) {
                        c47061t02.setLayoutParams(layoutParams);
                    }
                }
                C47061t0 c47061t03 = this.LJLILLLLZI;
                if (c47061t03 != null) {
                    c47061t03.setVisibility(0);
                }
                C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(this.LJLILLLLZI);
                return;
            }
        }
        C47061t0 c47061t04 = this.LJLILLLLZI;
        if (c47061t04 == null) {
            return;
        }
        c47061t04.setVisibility(8);
    }
}
