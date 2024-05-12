package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.vesdk.VEUtils;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AqS40S1000000_2;
import kotlin.jvm.internal.IDqS426S0100000_1;

/* renamed from: X.4il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC117154il implements Runnable {
    public final InterfaceC117174in LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final ArrayList<Integer> LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public Future<?> LJLJJLL;

    public final void LIZ() {
        String str = "";
        byte[] bArr = null;
        LIZIZ(0, 102, "", null);
        String LIZ = this.LJLIL.LIZ();
        if (LIZ.length() == 0) {
            LIZIZ(1, -100, "", null);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("stage", 1);
            c6bk.LIZ.put("result", -100);
            C43882HKc.LIZLLL(-100, "creative_tool_audio_copyright_detect", c6bk.LJ(), true);
            this.LJLJJL.invoke();
            return;
        }
        String parent = new File(LIZ).getParent();
        if (parent != null) {
            str = parent;
        }
        IDqS426S0100000_1 iDqS426S0100000_1 = new IDqS426S0100000_1(new IDqS426S0100000_1(this, 7), 8);
        String LJFF = i0.LJFF(str, "/audio_temp.wav");
        iDqS426S0100000_1.invoke(C4E8.AUDIO_START, null, null);
        int transCodeAudio = VEUtils.transCodeAudio(LIZ, LJFF, 1, -1, LiveCenterDelayLoadSetting.DEFAULT);
        if (LJFF != null && LJFF.length() != 0) {
            File file = new File(LJFF);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    if (fileInputStream.getChannel().size() != 0) {
                        byte[] bArr2 = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr2);
                        bArr = bArr2;
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        iDqS426S0100000_1.invoke(C4E8.AUDIO_END, Boolean.valueOf(transCodeAudio == 0), bArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZIZ(int i, int i2, String str, HashMap<Integer, PreCheckResult> hashMap) {
        List list = (List) ((LinkedHashMap) C6EG.LIZIZ).get(this.LJLJI);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC117164im) it.next()).LIZ(i, i2, this.LJLILLLLZI, hashMap);
            }
        }
    }

    public RunnableC117154il(C127034yh c127034yh, int i, String str, ArrayList arrayList, AqS40S1000000_2 aqS40S1000000_2) {
        this.LJLIL = c127034yh;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = arrayList;
        this.LJLJJL = aqS40S1000000_2;
    }
}
