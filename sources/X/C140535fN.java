package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140535fN extends AbstractC65781Prl implements InterfaceC88472Yns<BaseStickerModel, BaseStickerModel> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ float LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140535fN(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = i6;
        this.LJLJL = i7;
        this.LJLJLJ = i8;
        this.LJLJLLL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final BaseStickerModel invoke(BaseStickerModel baseStickerModel) {
        BaseStickerModel setState = baseStickerModel;
        o.LJIIIZ(setState, "$this$setState");
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        float f = i2 / 2.0f;
        int i3 = this.LJLJI;
        int i4 = this.LJLJJI;
        float f2 = i4 / 2.0f;
        int i5 = this.LJLJJL;
        int i6 = this.LJLJJLL;
        int i7 = this.LJLJL;
        int i8 = this.LJLJLJ;
        return BaseStickerModel.copy$default(setState, 0, 0, null, i, i3, f + i, f2 + i3, i2, i4, i5, i6, i7, i8, i7, i8, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.LJLJLLL, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -16809977, null);
    }
}
