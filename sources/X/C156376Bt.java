package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.6Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156376Bt extends C156396Bv<C42802Gr0> {
    public static final /* synthetic */ int LLIILZL = 0;
    public C82622Wbi LLIIL;
    public final C62822Ol8 LLIILII;

    private final C63H getEditHashTagStickerApi() {
        return (C63H) this.LLIILII.getValue();
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        return getEditHashTagStickerApi().LJIIIIZZ();
    }

    public final HashtagStruct getHashTagStruct() {
        C6CH c6ch;
        HashtagStruct hashTagStruct;
        AbstractC156406Bw<C42802Gr0> mBaseView = getMBaseView();
        if (!(mBaseView instanceof C6CH) || (c6ch = (C6CH) mBaseView) == null || (hashTagStruct = c6ch.getHashTagStruct()) == null) {
            return new HashtagStruct();
        }
        return hashTagStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156376Bt(Context context) {
        super(context);
        new LinkedHashMap();
        this.LLIILII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 53));
    }
}
