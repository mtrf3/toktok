package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oek, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62426Oek extends AbstractC65781Prl implements InterfaceC88472Yns<C62427Oel, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62426Oek(long j, String str) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C62427Oel c62427Oel) {
        C62427Oel imageCardTranslationInfoMap = c62427Oel;
        o.LJIIIZ(imageCardTranslationInfoMap, "$this$imageCardTranslationInfoMap");
        imageCardTranslationInfoMap.LIZLLL("common_use_videos_created", C47261Igj.LJJIJ(Long.valueOf(this.LJLIL)));
        String videoCount = String.valueOf(this.LJLIL);
        o.LJIIIZ(videoCount, "videoCount");
        imageCardTranslationInfoMap.LIZJ = new C45322HqY(videoCount, (List) C61878OQg.INSTANCE);
        imageCardTranslationInfoMap.LIZJ("poidmcard_you_shared", C47261Igj.LJJIJ(this.LJLILLLLZI));
        imageCardTranslationInfoMap.LIZIZ("poidmcard_shared_location", C47261Igj.LJJIJ(this.LJLILLLLZI));
        imageCardTranslationInfoMap.LIZ("poidmcard_location", C47261Igj.LJJIJ(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
