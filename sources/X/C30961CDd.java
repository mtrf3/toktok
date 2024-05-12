package X;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* renamed from: X.CDd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30961CDd extends CDI {
    public final float LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final C47061t0 LJLJJI;
    public final C47061t0 LJLJJL;
    public final C47061t0 LJLJJLL;
    public final C47061t0 LJLJL;
    public final ConstraintLayout LJLJLJ;
    public final C47061t0 LJLJLLL;
    public final ConstraintLayout LJLL;
    public final C47061t0 LJLLI;
    public final ConstraintLayout LJLLILLLL;
    public final C47061t0 LJLLJ;
    public final /* synthetic */ CDG LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30961CDd(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh_, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLLL = cdg;
        this.LJLIL = 0.73282444f;
        this.LJLILLLLZI = (C47121t6) this.itemView.findViewById(R.id.mo6);
        this.LJLJI = (C47061t0) this.itemView.findViewById(R.id.n4w);
        this.LJLJJI = (C47061t0) this.itemView.findViewById(R.id.n4x);
        this.LJLJJL = (C47061t0) this.itemView.findViewById(R.id.n4y);
        this.LJLJJLL = (C47061t0) this.itemView.findViewById(R.id.n4z);
        this.LJLJL = (C47061t0) this.itemView.findViewById(R.id.n50);
        this.LJLJLJ = (ConstraintLayout) this.itemView.findViewById(R.id.n55);
        this.LJLJLLL = (C47061t0) this.itemView.findViewById(R.id.n58);
        this.LJLL = (ConstraintLayout) this.itemView.findViewById(R.id.n56);
        this.LJLLI = (C47061t0) this.itemView.findViewById(R.id.n59);
        this.LJLLILLLL = (ConstraintLayout) this.itemView.findViewById(R.id.n57);
        this.LJLLJ = (C47061t0) this.itemView.findViewById(R.id.n5_);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        int i2;
        String str;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;
        SOVBriefInfo sOVBriefInfo;
        SOVBriefInfo sOVBriefInfo2;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo2;
        List<SOVBriefInfo> list;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo3;
        List<SOVBriefInfo> list2;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo4;
        List<SOVBriefInfo> list3;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo5;
        o.LJIIIZ(holder, "holder");
        GetSubPrivilegeDetailResponse.Data data = this.LJLLL.LJLJI;
        if (data != null && (subOnlyVideosBriefInfo5 = data.subOnlyVideosBriefInfo) != null) {
            i2 = subOnlyVideosBriefInfo5.totalCount;
        } else {
            i2 = 0;
        }
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            Object[] objArr = new Object[1];
            if (data == null || (subOnlyVideosBriefInfo = data.subOnlyVideosBriefInfo) == null || (str = subOnlyVideosBriefInfo.totalCountStr) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            objArr[0] = str;
            c47121t6.setText(C15380j0.LJIILL(R.string.ob2, objArr));
        }
        if (i2 <= 3) {
            C47061t0 c47061t0 = this.LJLJJLL;
            if (c47061t0 != null) {
                c47061t0.setVisibility(8);
            }
            C47061t0 c47061t02 = this.LJLJL;
            if (c47061t02 != null) {
                c47061t02.setVisibility(8);
            }
            C47061t0 c47061t03 = this.LJLJJL;
            if (c47061t03 != null) {
                C29306Beo.LJJJJL(C15380j0.LIZ(12.0f), c47061t03);
            }
        } else {
            C47061t0 c47061t04 = this.LJLJJLL;
            if (c47061t04 != null) {
                c47061t04.setVisibility(0);
            }
            C47061t0 c47061t05 = this.LJLJL;
            if (c47061t05 != null) {
                c47061t05.setVisibility(0);
            }
            C15490jB.LJ(this.LJLJJLL, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mock_1.png");
            C15490jB.LJ(this.LJLJL, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mock_2.png");
            C47061t0 c47061t06 = this.LJLJJL;
            if (c47061t06 != null) {
                C29306Beo.LJJJJL(C15380j0.LIZ(5.0f), c47061t06);
            }
        }
        C47061t0 c47061t07 = this.LJLJI;
        if (c47061t07 != null) {
            c47061t07.setAspectRatio(this.LJLIL);
        }
        C47061t0 c47061t08 = this.LJLJJI;
        if (c47061t08 != null) {
            c47061t08.setAspectRatio(this.LJLIL);
        }
        C47061t0 c47061t09 = this.LJLJJL;
        if (c47061t09 != null) {
            c47061t09.setAspectRatio(this.LJLIL);
        }
        GetSubPrivilegeDetailResponse.Data data2 = this.LJLLL.LJLJI;
        SOVBriefInfo sOVBriefInfo3 = null;
        if (data2 != null && (subOnlyVideosBriefInfo4 = data2.subOnlyVideosBriefInfo) != null && (list3 = subOnlyVideosBriefInfo4.sovBriefInfo) != null) {
            sOVBriefInfo = (SOVBriefInfo) ORZ.LJLLLLLL(0, list3);
        } else {
            sOVBriefInfo = null;
        }
        M(sOVBriefInfo, this.LJLJI, this.LJLJLJ, this.LJLJLLL);
        GetSubPrivilegeDetailResponse.Data data3 = this.LJLLL.LJLJI;
        if (data3 != null && (subOnlyVideosBriefInfo3 = data3.subOnlyVideosBriefInfo) != null && (list2 = subOnlyVideosBriefInfo3.sovBriefInfo) != null) {
            sOVBriefInfo2 = (SOVBriefInfo) ORZ.LJLLLLLL(1, list2);
        } else {
            sOVBriefInfo2 = null;
        }
        M(sOVBriefInfo2, this.LJLJJI, this.LJLL, this.LJLLI);
        GetSubPrivilegeDetailResponse.Data data4 = this.LJLLL.LJLJI;
        if (data4 != null && (subOnlyVideosBriefInfo2 = data4.subOnlyVideosBriefInfo) != null && (list = subOnlyVideosBriefInfo2.sovBriefInfo) != null) {
            sOVBriefInfo3 = (SOVBriefInfo) ORZ.LJLLLLLL(2, list);
        }
        M(sOVBriefInfo3, this.LJLJJL, this.LJLLILLLL, this.LJLLJ);
    }

    public final void M(SOVBriefInfo sOVBriefInfo, C47061t0 c47061t0, ConstraintLayout constraintLayout, C47061t0 c47061t02) {
        ImageModel imageModel;
        SOVMaskInfo sOVMaskInfo;
        if (sOVBriefInfo != null && (sOVMaskInfo = sOVBriefInfo.maskInfo) != null && sOVMaskInfo.type == 1) {
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            C15490jB.LJ(c47061t02, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
            return;
        }
        ConstraintLayout constraintLayout2 = this.LJLJLJ;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        BQO LIZ = C15650jR.LIZ();
        if (sOVBriefInfo != null) {
            imageModel = sOVBriefInfo.cover;
        } else {
            imageModel = null;
        }
        LIZ.LJIIIZ(imageModel).LJIIJJI(c47061t0);
    }
}
