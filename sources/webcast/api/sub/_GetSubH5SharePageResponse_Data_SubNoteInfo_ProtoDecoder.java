package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._NoteDetail_ProtoDecoder;
import webcast.api.sub.GetSubH5SharePageResponse;

/* loaded from: classes6.dex */
public final class _GetSubH5SharePageResponse_Data_SubNoteInfo_ProtoDecoder implements InterfaceC31105CIr<GetSubH5SharePageResponse.Data.SubNoteInfo> {
    public static GetSubH5SharePageResponse.Data.SubNoteInfo LIZIZ(Q9H q9h) {
        GetSubH5SharePageResponse.Data.SubNoteInfo subNoteInfo = new GetSubH5SharePageResponse.Data.SubNoteInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subNoteInfo.showNoteDetail = Q9J.LIZ(q9h);
                    }
                } else {
                    subNoteInfo.noteDetail = _NoteDetail_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subNoteInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubH5SharePageResponse.Data.SubNoteInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
