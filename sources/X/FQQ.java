package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.g0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class FQQ implements PHH {
    public File LJLIL;
    public final List<String> LJLILLLLZI = new CopyOnWriteArrayList();
    public long LJLJI = -1;

    @Override // X.PHH
    public final void LIZIZ(boolean z) {
    }

    public final void LIZ() {
        if (this.LJLIL == null || System.currentTimeMillis() - this.LJLJI < 1000) {
            return;
        }
        this.LJLJI = System.currentTimeMillis();
        BufferedReader bufferedReader = null;
        try {
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(this.LJLIL), "utf-8"));
            int i = 1;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        if (i >= 0) {
                            arrayList.add(readLine);
                        }
                        i++;
                    } else {
                        ((CopyOnWriteArrayList) this.LJLILLLLZI).clear();
                        ((CopyOnWriteArrayList) this.LJLILLLLZI).addAll(arrayList);
                        g0.LJJIJL(bufferedReader2);
                        return;
                    }
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    g0.LJJIJL(bufferedReader);
                    return;
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // X.PHH
    public final void init() {
        this.LJLIL = new File("/proc/net/xt_qtaguid/stats");
    }

    @Override // X.PHH
    public final long LIZJ() {
        return LJJIIJZLJL() + LJFF();
    }

    @Override // X.PHH
    public final long LJFF() {
        int myUid = Process.myUid();
        LIZ();
        if (C17N.LJJIIZI(this.LJLILLLLZI)) {
            return -1L;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI).iterator();
        long j = 0;
        long j2 = 0;
        while (true) {
            if (it.hasNext()) {
                String[] split = ((String) it.next()).split(" ");
                try {
                    if (!TextUtils.equals(split[3], "uid_tag_int") && myUid == CastIntegerProtector.parseInt(split[3])) {
                        long parseLong = CastLongProtector.parseLong(split[5]);
                        long parseLong2 = CastLongProtector.parseLong(split[7]);
                        if (CastLongProtector.valueOf(split[4]).longValue() == 0 && split[1].startsWith("wlan")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                j += j2;
                return j;
            }
        }
    }

    @Override // X.PHH
    public final long LJIILL() {
        return LJJL() + LJIILLIIL();
    }

    @Override // X.PHH
    public final long LJIILLIIL() {
        int myUid = Process.myUid();
        LIZ();
        if (C17N.LJJIIZI(this.LJLILLLLZI)) {
            return -1L;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI).iterator();
        long j = 0;
        long j2 = 0;
        while (true) {
            if (it.hasNext()) {
                String[] split = ((String) it.next()).split(" ");
                try {
                    if (!TextUtils.equals(split[3], "uid_tag_int") && myUid == CastIntegerProtector.parseInt(split[3])) {
                        long parseLong = CastLongProtector.parseLong(split[5]);
                        long parseLong2 = CastLongProtector.parseLong(split[7]);
                        if (CastLongProtector.valueOf(split[4]).longValue() == 0 && split[1].startsWith("rmnet_data")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                j += j2;
                return j;
            }
        }
    }

    @Override // X.PHH
    public final long LJJI() {
        return LIZJ() + LJIILL();
    }

    @Override // X.PHH
    public final long LJJIIJZLJL() {
        int myUid = Process.myUid();
        LIZ();
        if (C17N.LJJIIZI(this.LJLILLLLZI)) {
            return -1L;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI).iterator();
        long j = 0;
        long j2 = 0;
        while (true) {
            if (it.hasNext()) {
                String[] split = ((String) it.next()).split(" ");
                try {
                    if (!TextUtils.equals(split[3], "uid_tag_int") && myUid == CastIntegerProtector.parseInt(split[3])) {
                        long parseLong = CastLongProtector.parseLong(split[5]);
                        long parseLong2 = CastLongProtector.parseLong(split[7]);
                        if (CastLongProtector.valueOf(split[4]).longValue() == 1 && split[1].startsWith("wlan")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                j += j2;
                return j;
            }
        }
    }

    @Override // X.PHH
    public final long LJJL() {
        int myUid = Process.myUid();
        LIZ();
        if (C17N.LJJIIZI(this.LJLILLLLZI)) {
            return -1L;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI).iterator();
        long j = 0;
        long j2 = 0;
        while (true) {
            if (it.hasNext()) {
                String[] split = ((String) it.next()).split(" ");
                try {
                    if (!TextUtils.equals(split[3], "uid_tag_int") && myUid == CastIntegerProtector.parseInt(split[3])) {
                        long parseLong = CastLongProtector.parseLong(split[5]);
                        long parseLong2 = CastLongProtector.parseLong(split[7]);
                        if (CastLongProtector.valueOf(split[4]).longValue() == 1 && split[1].startsWith("rmnet_data")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                j += j2;
                return j;
            }
        }
    }
}
