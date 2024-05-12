package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource", f = "DefaultStickerSource.kt", l = {525, 474}, m = "postCategoryDataUpdate")
/* renamed from: X.TIt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74423TIt extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C74418TIo LJLJI;
    public Object LJLJJI;
    public CategoryEffectModel LJLJJL;
    public AqS194S0100000_12 LJLJJLL;
    public AqS194S0100000_12 LJLJL;
    public AqS178S0100000_12 LJLJLJ;
    public XJO LJLJLLL;
    public boolean LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74423TIt(C74418TIo c74418TIo, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c74418TIo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIJI(null, false, this);
    }
}
