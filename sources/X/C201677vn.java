package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201677vn extends AbstractC65781Prl implements InterfaceC88473Ynt<ReportVideoMaskAssem, VideoMaskInfo, Boolean, C76800UCe> {
    public static final C201677vn INSTANCE = new C201677vn();

    public C201677vn() {
        super(3);
    }

    public final void invoke(ReportVideoMaskAssem selectSubscribe, VideoMaskInfo videoMaskInfo, boolean z) {
        String string;
        String string2;
        String string3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (z) {
            if (selectSubscribe.Y3().getVisibility() == 0) {
                return;
            }
            Context context = selectSubscribe.Y3().getContext();
            TextView textView = (TextView) selectSubscribe.Y3().findViewById(R.id.title);
            if (textView != null) {
                if (videoMaskInfo == null || (string = videoMaskInfo.getTitle()) == null) {
                    string = context.getString(R.string.q2i);
                }
                textView.setText(string);
            }
            TextView textView2 = (TextView) selectSubscribe.Y3().findViewById(R.id.bst);
            if (videoMaskInfo == null || (string2 = videoMaskInfo.getContent()) == null) {
                string2 = context.getString(R.string.q2g);
            }
            textView2.setText(string2);
            TuxTextView tuxTextView = (TuxTextView) selectSubscribe.Y3().findViewById(R.id.b1h);
            if (tuxTextView != null) {
                if (videoMaskInfo == null || (string3 = videoMaskInfo.getCancelMaskLabel()) == null) {
                    string3 = context.getString(R.string.q2h);
                }
                tuxTextView.setText(string3);
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS38S0200000_3(selectSubscribe, context, 34));
            }
            selectSubscribe.Y3().setVisibility(0);
            selectSubscribe.p4().mv0("reportlayer_show");
            ReportVideoMaskVM p4 = selectSubscribe.p4();
            o.LJIIIIZZ(context, "context");
            p4.lv0(context, "othershow");
            return;
        }
        selectSubscribe.Y3().setVisibility(8);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(ReportVideoMaskAssem reportVideoMaskAssem, VideoMaskInfo videoMaskInfo, Boolean bool) {
        invoke(reportVideoMaskAssem, videoMaskInfo, bool.booleanValue());
        return C76800UCe.LIZ;
    }
}
