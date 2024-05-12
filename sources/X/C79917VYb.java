package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VYb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79917VYb {
    public List<NinePatchDiv> LIZ = new ArrayList();
    public List<NinePatchDiv> LIZIZ = new ArrayList();
    public Rect LIZJ = new Rect();
    public int[] LIZLLL = new int[0];

    public final byte[] LIZ() {
        ByteBuffer order = ByteBuffer.allocate((this.LIZLLL.length * 4) + (this.LIZIZ.size() * 2 * 4) + (this.LIZ.size() * 2 * 4) + 32).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) (this.LIZ.size() * 2));
        order.put((byte) (this.LIZIZ.size() * 2));
        order.put((byte) this.LIZLLL.length);
        order.putInt(0);
        order.putInt(0);
        order.putInt(this.LIZJ.left);
        order.putInt(this.LIZJ.right);
        order.putInt(this.LIZJ.top);
        order.putInt(this.LIZJ.bottom);
        order.putInt(0);
        for (NinePatchDiv ninePatchDiv : this.LIZ) {
            order.putInt(ninePatchDiv.getStart());
            order.putInt(ninePatchDiv.getEnd());
        }
        for (NinePatchDiv ninePatchDiv2 : this.LIZIZ) {
            order.putInt(ninePatchDiv2.getStart());
            order.putInt(ninePatchDiv2.getEnd());
        }
        for (int i : this.LIZLLL) {
            order.putInt(i);
        }
        byte[] array = order.array();
        o.LJIIIIZZ(array, "byteBuffer.array()");
        return array;
    }
}
