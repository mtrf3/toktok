package X;

import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.Message;

/* renamed from: X.OwG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63512OwG extends Message.Builder<ModifyPropertyContent, C63512OwG> {
    public EnumC63258OsA LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyPropertyContent build() {
        return new ModifyPropertyContent(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
