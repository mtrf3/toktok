package X;

import java.io.OutputStream;

/* loaded from: classes15.dex */
public interface W98 {
    boolean canResize(W8X w8x, V85 v85, C79238V7y c79238V7y);

    boolean canTranscode(C81828W9o c81828W9o);

    String getIdentifier();

    V8V transcode(W8X w8x, OutputStream outputStream, V85 v85, C79238V7y c79238V7y, C81828W9o c81828W9o, Integer num);
}
