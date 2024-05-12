package X;

import java.io.StringWriter;

/* loaded from: classes12.dex */
public class PN2 extends StringWriter {
    public int LJLIL;
    public boolean LJLILLLLZI;

    @Override // java.io.StringWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        if (this.LJLILLLLZI) {
            return;
        }
        int i3 = this.LJLIL;
        if (i3 + i2 > 4000) {
            this.LJLILLLLZI = true;
        } else {
            this.LJLIL = i3 + i2;
            super.write(str, i, i2);
        }
    }
}
