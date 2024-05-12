package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45477Ht3 extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C45473Hsz LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45477Ht3(C45473Hsz c45473Hsz) {
        super(1100, 2);
        this.LJLJJLL = c45473Hsz;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        EditorProModel editorProModel;
        String str;
        CreativeFlowData creativeFlowData;
        o.LJIIIZ(v, "v");
        ShortVideoContext shortVideoContext = this.LJLJJLL.LIZ;
        String str2 = null;
        if (shortVideoContext != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null) {
            editorProModel = creativeFlowData.getEditorProModel();
        } else {
            editorProModel = null;
        }
        if (editorProModel != null) {
            editorProModel.setFromEditorProEntranceInAlbum(false);
        }
        ArrayList<MyMediaModel> LJJIIJZLJL = this.LJLJJLL.LJJIIJZLJL();
        C45473Hsz c45473Hsz = this.LJLJJLL;
        Iterator<MyMediaModel> it = LJJIIJZLJL.iterator();
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            if (C6KD.LIZIZ.contains(next.fileLocalUriPath)) {
                C45474Ht0 c45474Ht0 = c45473Hsz.LIZJ;
                if (c45474Ht0 != null) {
                    Context context = c45474Ht0.getContext();
                    o.LJIIIIZZ(context, "videoImageMixedView.context");
                    C6KC.LIZJ(context, next.fileLocalUriPath, "video_upload", true, 16);
                    return;
                }
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        C45473Hsz c45473Hsz2 = this.LJLJJLL;
        InterfaceC45535Htz interfaceC45535Htz = c45473Hsz2.LJIIZILJ;
        if (interfaceC45535Htz != null) {
            interfaceC45535Htz.LIZIZ(c45473Hsz2.LJJIIJZLJL());
        }
        ArrayList<MyMediaModel> LJJIIJZLJL2 = this.LJLJJLL.LJJIIJZLJL();
        C45473Hsz c45473Hsz3 = this.LJLJJLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIIJZLJL2, 10));
        Iterator<MyMediaModel> it2 = LJJIIJZLJL2.iterator();
        while (it2.hasNext()) {
            MyMediaModel next2 = it2.next();
            C63B c63b = AutoCutMediaModel.Companion;
            C45474Ht0 c45474Ht02 = c45473Hsz3.LIZJ;
            if (c45474Ht02 != null) {
                Context context2 = c45474Ht02.getContext();
                c63b.getClass();
                arrayList.add(C63B.LIZ(context2, next2));
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        ShortVideoContext shortVideoContext2 = this.LJLJJLL.LIZ;
        if (shortVideoContext2 != null) {
            str = shortVideoContext2.shootWay;
            str2 = shortVideoContext2.LJI();
        } else {
            str = null;
        }
        C45049Hm9.LJIIJ(arrayList, "upload_page", str, str2, false, 0, "");
    }
}
