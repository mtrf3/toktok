package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.OaE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62146OaE extends FrameLayout implements OZX {
    public final C62180Oam LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final C62846OlW LJLJJL;

    @Override // X.OZX
    public final void LIZ() {
    }

    @Override // X.OZX
    public C62180Oam getQrCodeSquareView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62146OaE(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cmi, this, true);
        C62180Oam c62180Oam = (C62180Oam) findViewById(R.id.jtw);
        this.LJLIL = c62180Oam;
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.jtz);
        this.LJLJI = (TuxTextView) findViewById(R.id.ju2);
        this.LJLJJI = (TuxTextView) findViewById(R.id.jtx);
        this.LJLJJL = (C62846OlW) findViewById(R.id.ju1);
        if (c62180Oam != null) {
            UgCommonServiceImpl.LJIJ().LIZIZ();
            C82802Wec.LJIIJ(c62180Oam, "qr_code_default_view");
        }
    }
}
