package X;

import android.content.Context;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6U7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6U7 implements InterfaceC221738n3 {
    public final C62822Ol8 LIZ;

    @Override // X.InterfaceC221738n3
    public final C161096Tx getView() {
        return (C161096Tx) this.LIZ.getValue();
    }

    @Override // X.InterfaceC221738n3
    public final void LIZ(AddYoursStickerStruct struct) {
        o.LJIIIZ(struct, "struct");
        C161096Tx c161096Tx = (C161096Tx) this.LIZ.getValue();
        List<AddYoursAvatar> userAvatars = struct.getUserAvatars();
        Long videoCount = struct.getVideoCount();
        if (c161096Tx.LJLJLLL == null) {
            c161096Tx.LIZLLL();
        }
        if (userAvatars != null && !o.LJ(c161096Tx.LJLL, userAvatars)) {
            c161096Tx.LJLL = userAvatars;
            c161096Tx.getAvatarListView().LIZJ(C62819Ol5.LJIIZILJ(userAvatars));
        }
        if (videoCount != null && userAvatars != null) {
            c161096Tx.getAvatarListView().LJ(videoCount.longValue() - userAvatars.size());
        }
    }

    public C6U7(Context context, C6UI c6ui) {
        this.LIZ = C221108m2.LIZIZ(new AqS149S0200000_2(context, c6ui, 109));
    }
}
