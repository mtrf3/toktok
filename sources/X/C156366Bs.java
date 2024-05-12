package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156366Bs extends C156396Bv<User> {
    public static final /* synthetic */ int LLIILZL = 0;
    public C82622Wbi LLIIL;
    public final C62822Ol8 LLIILII;

    private final C63I getEditMentionStickerApi() {
        return (C63I) this.LLIILII.getValue();
    }

    public final C82622Wbi getDiContainer() {
        C82622Wbi c82622Wbi = this.LLIIL;
        if (c82622Wbi != null) {
            return c82622Wbi;
        }
        o.LJIJI("diContainer");
        throw null;
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        return getEditMentionStickerApi().LJIIIIZZ();
    }

    public final MentionStruct getMentionStruct() {
        C6CI c6ci;
        MentionStruct mentionStruct;
        AbstractC156406Bw<User> mBaseView = getMBaseView();
        if (!(mBaseView instanceof C6CI) || (c6ci = (C6CI) mBaseView) == null || (mentionStruct = c6ci.getMentionStruct()) == null) {
            return new MentionStruct();
        }
        return mentionStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156366Bs(Context context) {
        super(context);
        new LinkedHashMap();
        this.LLIILII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 672));
    }

    public final void setDiContainer(C82622Wbi c82622Wbi) {
        o.LJIIIZ(c82622Wbi, "<set-?>");
        this.LLIIL = c82622Wbi;
    }
}
