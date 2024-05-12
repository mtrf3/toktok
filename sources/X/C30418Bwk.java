package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30418Bwk extends TBS implements InterfaceC88472Yns<OSZ<? extends Boolean, ? extends Long>, C76800UCe> {
    public C30418Bwk(Object obj) {
        super(1, obj, PreviewBeautyWidget.class, "onStartLiveSuccess", "onStartLiveSuccess(Lkotlin/Pair;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(OSZ<? extends Boolean, ? extends Long> osz) {
        OSZ<? extends Boolean, ? extends Long> p0 = osz;
        o.LJIIIZ(p0, "p0");
        PreviewBeautyWidget previewBeautyWidget = (PreviewBeautyWidget) this.receiver;
        previewBeautyWidget.getClass();
        if (p0.getFirst().booleanValue()) {
            C30355Bvj.LJIIIZ().LJ(previewBeautyWidget.LJLJL);
        }
        return C76800UCe.LIZ;
    }
}
