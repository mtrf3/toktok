package X;

import android.graphics.Paint;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* renamed from: X.59b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301959b extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C1301959b LJLIL = new C1301959b();

    public C1301959b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ColorProtector.parseColor("#80545454"));
        return paint;
    }
}
