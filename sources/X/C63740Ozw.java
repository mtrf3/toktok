package X;

import com.bytedance.im.core.proto.InputStatusNotify;
import com.squareup.wire.Message;

/* renamed from: X.Ozw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63740Ozw extends Message.Builder<InputStatusNotify, C63740Ozw> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public EnumC63506OwA LJI;
    public EnumC63669Oyn LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InputStatusNotify build() {
        EnumC63669Oyn enumC63669Oyn = this.LJII;
        if (enumC63669Oyn != null && this.LJIIIIZZ != null) {
            return new InputStatusNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(enumC63669Oyn, "input_status", this.LJIIIIZZ, "create_time");
        throw null;
    }
}
