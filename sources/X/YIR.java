package X;

import X.YIN;
import X.YIR;
import java.io.IOException;

/* loaded from: classes16.dex */
public class YIR<MessageType extends YIN<MessageType, BuilderType>, BuilderType extends YIR<MessageType, BuilderType>> extends YIX<MessageType, BuilderType> {
    public final YIN LJLIL;
    public YIN LJLILLLLZI;
    public boolean LJLJI = false;

    @Override // X.YIK
    public final /* synthetic */ YIN LIZLLL() {
        return this.LJLIL;
    }

    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final YIR clone() {
        YIR yir = (YIR) this.LJLIL.LJIIZILJ(5);
        yir.LJI(LJIIIZ());
        return yir;
    }

    public final MessageType LJIIIZ() {
        if (this.LJLJI) {
            return (MessageType) this.LJLILLLLZI;
        }
        YIN yin = this.LJLILLLLZI;
        C87158YIo.LIZJ.LIZ(yin.getClass()).LIZIZ(yin);
        this.LJLJI = true;
        return (MessageType) this.LJLILLLLZI;
    }

    public final void LJIIJ() {
        YIN yin = (YIN) this.LJLILLLLZI.LJIIZILJ(4);
        C87158YIo.LIZJ.LIZ(yin.getClass()).LIZLLL(yin, this.LJLILLLLZI);
        this.LJLILLLLZI = yin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType LJIIIIZZ() {
        /*
            r3 = this;
            X.YIN r2 = r3.LJIIIZ()
            r1 = 1
            java.lang.Object r0 = r2.LJIIZILJ(r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            if (r0 != r1) goto L12
        L11:
            return r2
        L12:
            if (r0 == 0) goto L29
            X.YIo r1 = X.C87158YIo.LIZJ
            java.lang.Class r0 = r2.getClass()
            X.YIV r0 = r1.LIZ(r0)
            boolean r1 = r0.LJIIIIZZ(r2)
            r0 = 2
            r2.LJIIZILJ(r0)
            if (r1 == 0) goto L29
            goto L11
        L29:
            X.YIM r0 = new X.YIM
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YIR.LJIIIIZZ():X.YIN");
    }

    public YIR(MessageType messagetype) {
        this.LJLIL = messagetype;
        this.LJLILLLLZI = (YIN) messagetype.LJIIZILJ(4);
    }

    public final void LJI(YIN yin) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        YIN yin2 = this.LJLILLLLZI;
        C87158YIo.LIZJ.LIZ(yin2.getClass()).LIZLLL(yin2, yin);
    }

    public final void LJII(byte[] bArr, int i, C68313QrV c68313QrV) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        try {
            C87158YIo.LIZJ.LIZ(this.LJLILLLLZI.getClass()).LJII(this.LJLILLLLZI, bArr, 0, i, new C87175YJf(c68313QrV));
        } catch (C87144YIa e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C87144YIa.LIZJ();
        }
    }
}
