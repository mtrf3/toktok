package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5kX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143735kX extends AbstractC65781Prl implements InterfaceC65784Pro<C82573Wav> {
    public final /* synthetic */ C143725kW LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ CreativeInfo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C143735kX(C143725kW c143725kW, String str, String str2, String str3, CreativeInfo creativeInfo) {
        super(0);
        this.LJLIL = c143725kW;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = creativeInfo;
    }

    @Override // X.InterfaceC65784Pro
    public final C82573Wav invoke() {
        C143725kW c143725kW = this.LJLIL;
        C82573Wav c82573Wav = new C82573Wav(c143725kW.LJLIL, c143725kW.LJLILLLLZI, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        this.LJLIL.add(R.id.jbn, c82573Wav, "EditPreviewStickerScene");
        return c82573Wav;
    }
}
