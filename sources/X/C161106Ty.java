package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161106Ty extends C6U8<AddYoursStickerModel> {
    @Override // X.C6U8
    public final C6UF LIZ() {
        return new C161096Tx(LIZIZ().LIZLLL, LIZIZ(), 6);
    }

    @Override // X.C6U8
    public final AddYoursStickerModel LIZJ(InteractStickerStruct interactStickerStruct) {
        AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
        o.LJIIIIZZ(addYoursStickerStruct, "data.addYoursStickerStruct");
        return C62819Ol5.LJIIIZ(addYoursStickerStruct);
    }
}
