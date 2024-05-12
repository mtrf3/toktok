package X;

import Y.ARunnableS12S1100000_11;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class QES implements QF3 {
    public final /* synthetic */ QET LIZ;

    @Override // X.QF3
    public final void run() {
        ReadableByteChannel c39669FhZ;
        ReadableByteChannel readableByteChannel;
        List<String> list;
        if (this.LIZ.LJIIJJI == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "http/1.1";
        int i = 0;
        while (true) {
            String headerFieldKey = this.LIZ.LJIIJJI.getHeaderFieldKey(i);
            if (headerFieldKey == null) {
                break;
            }
            if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                str = this.LIZ.LJIIJJI.getHeaderField(i);
            }
            if (!headerFieldKey.startsWith("X-Android")) {
                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.LIZ.LJIIJJI.getHeaderField(i)));
            }
            i++;
        }
        int responseCode = this.LIZ.LJIIJJI.getResponseCode();
        this.LIZ.LJIIIZ = new C61460OAe(new ArrayList(this.LIZ.LIZIZ), responseCode, this.LIZ.LJIIJJI.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0L);
        if (responseCode >= 300 && responseCode < 400 && (list = this.LIZ.LJIIIZ.LIZ().get("location")) != null) {
            QET qet = this.LIZ;
            String str2 = (String) ListProtector.get(list, 0);
            qet.getClass();
            qet.LJIL(1, 2, new ARunnableS12S1100000_11(qet, str2, 5));
            return;
        }
        this.LIZ.LJIJJLI();
        if (responseCode >= 400) {
            InputStream errorStream = this.LIZ.LJIIJJI.getErrorStream();
            QET qet2 = this.LIZ;
            if (errorStream != null) {
                if (errorStream instanceof FileInputStream) {
                    readableByteChannel = ((FileInputStream) errorStream).getChannel();
                } else {
                    readableByteChannel = new C39669FhZ(errorStream);
                }
            } else {
                readableByteChannel = null;
            }
            qet2.LJIIIIZZ = readableByteChannel;
            this.LIZ.getClass();
            throw null;
        }
        QET qet3 = this.LIZ;
        InputStream inputStream = qet3.LJIIJJI.getInputStream();
        if (inputStream instanceof FileInputStream) {
            c39669FhZ = ((FileInputStream) inputStream).getChannel();
        } else {
            c39669FhZ = new C39669FhZ(inputStream);
        }
        qet3.LJIIIIZZ = c39669FhZ;
        this.LIZ.getClass();
        throw null;
    }

    public QES(QET qet) {
        this.LIZ = qet;
    }
}
