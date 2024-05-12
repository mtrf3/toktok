package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ISZ implements ISA {
    public final LinkedList<String> LIZ = new LinkedList<>();
    public final LinkedList<String> LIZIZ = new LinkedList<>();
    public final List<ISY> LIZJ = new LinkedList();
    public final C35751E1j<String, Integer> LIZLLL = new C35751E1j<>(20);
    public final C35751E1j<String, HashMap<String, String>> LJ = new C35751E1j<>(20);
    public final C35751E1j<String, Boolean> LJFF = new C35751E1j<>(20);
    public final C35751E1j<String, Boolean> LJI = new C35751E1j<>(20);

    public static ISZ LIZJ(String str) {
        MappedByteBuffer map;
        ISZ isz = new ISZ();
        if (TextUtils.isEmpty(str)) {
            return isz;
        }
        int min = Math.min(Math.max(5120, 102400), 307200);
        int min2 = Math.min(Math.max(2, 4), 32);
        for (int i = 0; i < min2; i++) {
            C46638ISc c46638ISc = new C46638ISc(YE1.LIZIZ(str, "play_session_events_data_", i), min);
            boolean z = true;
            if (c46638ISc.LJFF || !c46638ISc.LJ || TextUtils.isEmpty(c46638ISc.LIZLLL)) {
                if (!c46638ISc.LJ || !TextUtils.isEmpty(c46638ISc.LIZLLL)) {
                    z = false;
                }
                c46638ISc.LJ = z;
            } else {
                try {
                    FileChannel channel = new RandomAccessFile(c46638ISc.LIZLLL, "rw").getChannel();
                    c46638ISc.LJI = channel;
                    map = channel.map(FileChannel.MapMode.READ_WRITE, 0L, c46638ISc.LIZIZ);
                    c46638ISc.LJII = map;
                } catch (IOException | IllegalArgumentException unused) {
                    c46638ISc.LJ = false;
                }
                if (map == null) {
                    c46638ISc.LJ = false;
                } else {
                    map.load();
                    if (c46638ISc.LJIIIIZZ(c46638ISc.LJ())) {
                        c46638ISc.LJFF = true;
                    } else {
                        c46638ISc.LJFF = false;
                        MappedByteBuffer mappedByteBuffer = c46638ISc.LJII;
                        if (mappedByteBuffer != null) {
                            mappedByteBuffer.rewind();
                        }
                    }
                    HashMap<String, HashMap<String, String>> hashMap = c46638ISc.LJIIIIZZ;
                    if (hashMap != null && !hashMap.isEmpty()) {
                        java.util.Set<String> keySet = hashMap.keySet();
                        isz.LJ.putAll(hashMap);
                        isz.LIZIZ.addAll(keySet);
                        Iterator<String> it = keySet.iterator();
                        if (it.hasNext()) {
                            String next = it.next();
                            if (!TextUtils.isEmpty(next) && i >= 0) {
                                isz.LIZLLL.put(next, Integer.valueOf(i));
                            }
                        }
                    }
                }
            }
            ((LinkedList) isz.LIZJ).add(c46638ISc);
        }
        return isz;
    }

    public final HashMap<String, String> LIZ(String str) {
        if (TextUtils.isEmpty(str) || !this.LJ.containsKey(str)) {
            return null;
        }
        return this.LJ.get(str);
    }

    public final ISY LIZIZ(String str) {
        Integer num;
        int intValue;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || !this.LIZLLL.containsKey(str) || (num = this.LIZLLL.get(str)) == null || (intValue = num.intValue()) < 0 || intValue >= ((LinkedList) this.LIZJ).size()) {
            return null;
        }
        return (ISY) ListProtector.get(this.LIZJ, intValue);
    }

    public final ISY LIZLLL(String str) {
        ISY isy;
        int i = 0;
        while (true) {
            if (i < ((LinkedList) this.LIZJ).size()) {
                ISY isy2 = (ISY) ListProtector.get(this.LIZJ, i);
                if (isy2 != null && isy2.LIZIZ(EnumC46636ISa.VALID_STATUS) && !isy2.LIZIZ(EnumC46636ISa.USING_STATUS)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0 || i >= ((LinkedList) this.LIZJ).size() || (isy = (ISY) ListProtector.get(this.LIZJ, i)) == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str) && i >= 0) {
            this.LIZLLL.put(str, Integer.valueOf(i));
        }
        return isy;
    }

    public final void LJ(ISQ isq, String str, String str2) {
        Boolean bool;
        int i = ISR.LIZ[isq.ordinal()];
        if ((i != 1 && i != 2 && i != 3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        int size = this.LIZ.size();
        if (size > 2) {
            while (true) {
                int i2 = size - 1;
                if (size <= 2) {
                    break;
                }
                String first = this.LIZ.getFirst();
                if (!TextUtils.isEmpty(first)) {
                    this.LIZ.remove(0);
                    this.LIZIZ.addLast(first);
                }
                size = i2;
            }
        }
        if (isq == ISQ.VIDEO_REQUEST && !TextUtils.isEmpty(str)) {
            this.LIZ.addLast(str);
        }
        String name = isq.name();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(name) && !TextUtils.isEmpty(str2)) {
            HashMap<String, String> LIZ = LIZ(str);
            if (LIZ == null) {
                LIZ = new HashMap<>();
                if (!TextUtils.isEmpty(str)) {
                    this.LJ.put(str, LIZ);
                }
            }
            LIZ.put(name, str2);
        }
        if (!TextUtils.isEmpty(str) && this.LJI.containsKey(str) && (bool = this.LJI.get(str)) != null && bool.booleanValue()) {
            if (!TextUtils.isEmpty(str)) {
                for (int i3 = 0; i3 < this.LIZIZ.size(); i3++) {
                    if (TextUtils.equals(str, this.LIZIZ.get(i3))) {
                        break;
                    }
                }
            }
            this.LIZIZ.addLast(str);
        }
        String name2 = isq.name();
        Object value = IZ8.J0.getValue();
        o.LJIIIIZZ(value, "<get-enableAntiLostWriteLast>(...)");
        if (((Boolean) value).booleanValue() || !ISQ.VIDEO_REQUEST.name().equals(name2)) {
            return;
        }
        ISY LIZIZ = LIZIZ(str);
        if (LIZIZ == null && (LIZIZ = LIZLLL(str)) == null) {
            return;
        }
        LIZIZ.LIZ(str, isq.name(), str2);
    }
}
