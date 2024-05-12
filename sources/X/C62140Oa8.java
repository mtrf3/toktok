package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.Oa8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62140Oa8 extends FrameLayout implements OZX {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final C62180Oam LJLJI;

    @Override // X.OZX
    public final void LIZ() {
    }

    @Override // X.OZX
    public C62180Oam getQrCodeSquareView() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62140Oa8(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cm9, this, true);
        C62180Oam c62180Oam = (C62180Oam) findViewById(R.id.jtw);
        this.LJLJI = c62180Oam;
        this.LJLILLLLZI = (TextView) findViewById(R.id.ju0);
        this.LJLIL = (TextView) findViewById(R.id.jtz);
        UgCommonServiceImpl.LJIJ().LIZIZ();
        if (c62180Oam != null) {
            C82802Wec.LJIIJ(c62180Oam, "qr_code_default_view");
        }
    }
}
