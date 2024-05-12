package Y;

import X.C71Y;
import X.C74Z;
import X.C77P;
import X.C77Z;
import X.InterfaceC64592gB;
import X.L61;
import X.L6F;
import X.OSZ;
import X.X1D;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import java.util.Set;

/* loaded from: classes4.dex */
public class AfS0S1111000_3 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S1111000_3 afS0S1111000_3, Object obj) {
        ViewerListResponse viewerListResponse = (ViewerListResponse) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load viewer list success  ");
        LIZ.append(viewerListResponse);
        C71Y.LIZLLL("VideoViewerListVM", X1D.LIZIZ(LIZ));
        if (afS0S1111000_3.z2) {
            ((Set) ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).LJLJLJ.getValue()).clear();
            if (afS0S1111000_3.i3 == C77P.ENTRANCE.getValue()) {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(new OSZ(afS0S1111000_3.s0, viewerListResponse), "REFRESH_ENTRANCE_VIDEO_VIEW_SUCCESS");
            } else {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(new OSZ(afS0S1111000_3.s0, viewerListResponse), "REFRESH_VIDEO_VIEWER_HISTORY_SUCCESS");
            }
        } else if (afS0S1111000_3.i3 == C77P.ENTRANCE.getValue()) {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(new OSZ(afS0S1111000_3.s0, viewerListResponse), "LOAD_MORE_ENTRANCE_VIDEO_VIEW_SUCCESS");
        } else {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(new OSZ(afS0S1111000_3.s0, viewerListResponse), "LOAD_MORE_VIDEO_VIEWER_HISTORY_SUCCESS");
        }
        L6F.LIZIZ.LIZLLL(L61.STORY, null, viewerListResponse.getViewerList(), C77Z.LJLIL);
        C74Z.LJFF((Set) ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).LJLJLJ.getValue(), viewerListResponse.getViewerList(), "normal_video", "viewer_list");
    }

    public static final void accept$1(AfS0S1111000_3 afS0S1111000_3, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load viewer list  fail ");
        LIZ.append(obj);
        C71Y.LIZLLL("VideoViewerListVM", X1D.LIZIZ(LIZ));
        if (afS0S1111000_3.z2) {
            if (afS0S1111000_3.i3 == C77P.ENTRANCE.getValue()) {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(new OSZ(afS0S1111000_3.s0, obj), "REFRESH_ENTRANCE_VIDEO_VIEW_FAIL");
                return;
            } else {
                ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(afS0S1111000_3.s0, "REFRESH_VIDEO_VIEWER_HISTORY_FAIL");
                return;
            }
        }
        if (afS0S1111000_3.i3 == C77P.ENTRANCE.getValue()) {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(new OSZ(afS0S1111000_3.s0, obj), "LOAD_MORE_ENTRANCE_VIDEO_VIEW_FAIL");
        } else {
            ((VideoViewerListVM.BubbleVideoViewerViewModel) afS0S1111000_3.l1).jv0(afS0S1111000_3.s0, "LOAD_MORE_VIDEO_VIEWER_HISTORY_FAIL");
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S1111000_3(int r2, com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM.BubbleVideoViewerViewModel r3, java.lang.String r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.z2 = r5
            r0.i3 = r2
            r0.l1 = r3
            r0.s0 = r4
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.z2 = r5
            r0.l1 = r3
            r0.i3 = r2
            r0.s0 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1111000_3.<init>(int, com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM$BubbleVideoViewerViewModel, java.lang.String, boolean, int):void");
    }
}
