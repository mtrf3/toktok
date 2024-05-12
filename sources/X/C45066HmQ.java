package X;

import com.bytedance.ies.smartmovie.jni.Meta;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.HmQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45066HmQ extends AbstractC65781Prl implements InterfaceC88472Yns<Meta, CharSequence> {
    public static final C45066HmQ LJLIL = new C45066HmQ();

    public C45066HmQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Meta meta) {
        Meta meta2 = meta;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(meta2.LIZLLL());
        LIZ.append(": ");
        LIZ.append(FileUtils.INSTANCE.checkFileExists(meta2.LIZLLL()));
        return X1D.LIZIZ(LIZ);
    }
}
