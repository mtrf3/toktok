package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.ForwardStreamEditSettingConfig;

/* loaded from: classes8.dex */
public final class GZ0 extends AbstractC65781Prl implements InterfaceC65784Pro<GZ2> {
    public static final GZ0 LJLIL = new GZ0();

    public GZ0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final GZ2 invoke() {
        C62822Ol8 c62822Ol8 = C41720GYy.LIZIZ;
        return new GZ2(((ForwardStreamEditSettingConfig) c62822Ol8.getValue()).defaultBufferCapacity, ((ForwardStreamEditSettingConfig) c62822Ol8.getValue()).maxBufferCapacity);
    }
}
