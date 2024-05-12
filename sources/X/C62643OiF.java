package X;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.OiF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62643OiF implements InterfaceC75158Tec, InterfaceC48038ItG, InterfaceC22840v2, InterfaceC32188CkC, InterfaceC44918Hk2 {
    public static final C62643OiF LJLIL = new C62643OiF();

    @Override // X.InterfaceC32188CkC
    public boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC32188CkC
    public boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC75158Tec
    public void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC32188CkC
    public void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILJJIL(int i, int i2, String str) {
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILL(Exception exc, String str) {
    }

    public void LJIILLIIL() {
        throw null;
    }

    @Override // X.InterfaceC32188CkC
    public void LJIIIZ() {
        InterfaceC62644OiG interfaceC62644OiG = JUT.LIZ;
        if (interfaceC62644OiG != null) {
            interfaceC62644OiG.LIZLLL();
        }
    }

    @Override // X.InterfaceC32188CkC
    public void LLLZL() {
        InterfaceC62644OiG interfaceC62644OiG = JUT.LIZ;
        if (interfaceC62644OiG != null) {
            interfaceC62644OiG.LIZJ();
        }
        InterfaceC62644OiG interfaceC62644OiG2 = JUT.LIZ;
        if (interfaceC62644OiG2 != null) {
            interfaceC62644OiG2.LJ();
        }
    }

    public static final JatoBoostConfig LJIJ(long j) {
        long j2 = 10000;
        long j3 = j / j2;
        return new JatoBoostConfig((j3 / j2) % j2, j3 % j2, j % j2);
    }

    @Override // X.InterfaceC44918Hk2
    public List LIZIZ(List list) {
        int i = 0;
        int i2 = -1;
        if (C53379KxD.LIZ()) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (o.LJ(((InterfaceC62486Ofi) it.next()).key(), "favorite")) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            Iterator it2 = list.iterator();
            int i4 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (o.LJ(((InterfaceC62486Ofi) it2.next()).key(), "captions")) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (C52266KfG.LIZIZ != 0 && i4 >= 0 && i3 >= 0 && i4 != i3 + 1) {
                Object remove = ListProtector.remove(list, i4);
                Iterator it3 = list.iterator();
                int i5 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (o.LJ(((InterfaceC62486Ofi) it3.next()).key(), "favorite")) {
                            break;
                        }
                        i5++;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < list.size() - 1) {
                    ListProtector.add(list, i5 + 1, remove);
                }
            }
        }
        C62445Of3.LIZIZ(list);
        C62445Of3.LIZ(list);
        if (C62623Ohv.LIZIZ.LJI()) {
            Iterator it4 = list.iterator();
            int i6 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (o.LJ(((InterfaceC62486Ofi) it4.next()).key(), "danmaku")) {
                    if (i6 >= 0) {
                        Iterator it5 = list.iterator();
                        int i7 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                                if (o.LJ(((InterfaceC62486Ofi) it5.next()).key(), "save")) {
                                    break;
                                }
                                i7++;
                            } else {
                                i7 = -1;
                                break;
                            }
                        }
                        Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (o.LJ(((InterfaceC62486Ofi) it6.next()).key(), "clear_mode")) {
                                i2 = i;
                                break;
                            }
                            i++;
                        }
                        if (i7 >= 0) {
                            int i8 = i7 + 1;
                            if (i6 != i8) {
                                ListProtector.add(list, i8, ListProtector.remove(list, i6));
                            }
                        } else if (i2 >= 0 && i6 != i2 - 1) {
                            ListProtector.add(list, i2, ListProtector.remove(list, i6));
                        }
                    }
                } else {
                    i6++;
                }
            }
        }
        return list;
    }

    @Override // X.InterfaceC32188CkC
    public void LJI(String s) {
        o.LJIIIZ(s, "s");
        InterfaceC62644OiG interfaceC62644OiG = JUT.LIZ;
        if (interfaceC62644OiG != null) {
            interfaceC62644OiG.LJII();
        }
    }

    @Override // X.InterfaceC32188CkC
    public void LJIIIIZZ(String s) {
        o.LJIIIZ(s, "s");
        InterfaceC62644OiG interfaceC62644OiG = JUT.LIZ;
        if (interfaceC62644OiG != null) {
            interfaceC62644OiG.LIZIZ();
        }
    }

    @Override // X.InterfaceC32188CkC
    public void LJIIJJI(String str) {
        InterfaceC62644OiG interfaceC62644OiG = JUT.LIZ;
        if (interfaceC62644OiG != null) {
            interfaceC62644OiG.LIZ(str);
        }
    }

    @Override // X.InterfaceC32188CkC
    public void LJIIL(String s) {
        InterfaceC62644OiG interfaceC62644OiG;
        o.LJIIIZ(s, "s");
        if (!TextUtils.isEmpty(s) && (interfaceC62644OiG = JUT.LIZ) != null) {
            interfaceC62644OiG.LJFF(s);
        }
    }

    @Override // X.InterfaceC22840v2
    public void LJIILIIL(C22830v1 outputData) {
        o.LJIIIZ(outputData, "outputData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("output == [");
        LIZ.append(outputData);
        LIZ.append(']');
        C0NB.LIZIZ("CoHostFriendNoticeService", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return it;
    }

    public static final String LJIIZILJ(int i, String str) {
        if (s.LJJJLZIJ(str, "signature", false)) {
            return str;
        }
        if (!s.LJJJLZIJ(str, "-resize-", false) && s.LJJJLZIJ(str, "-origin-", false)) {
            String LJJJJZ = ujb.o.LJJJJZ(str, "-origin-", "-resize-", false);
            try {
                StringBuilder sb = new StringBuilder(LJJJJZ);
                int LJJLIIJ = s.LJJLIIJ(LJJJJZ, ".", 6);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(':');
                LIZ.append(100);
                LIZ.append(':');
                LIZ.append(i);
                sb.insert(LJJLIIJ, X1D.LIZIZ(LIZ));
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "stringBuilder.insert(las…idth:$height\").toString()");
                return sb2;
            } catch (Exception unused) {
                return LJJJJZ;
            }
        }
        if (s.LJJJLZIJ(str, "-resize-", false)) {
            Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(str);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(':');
                LIZ2.append(100);
                LIZ2.append(':');
                LIZ2.append(i);
                return s.LJLIL(str, start, end, X1D.LIZIZ(LIZ2)).toString();
            }
        }
        return str;
    }

    @Override // X.InterfaceC32188CkC
    public void LJIIJ(int i, int i2, View view) {
        InterfaceC62644OiG interfaceC62644OiG = JUT.LIZ;
        if (interfaceC62644OiG != null) {
            interfaceC62644OiG.LJI(i, i2, view);
        }
    }
}
