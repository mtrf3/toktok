package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.u;
import java.util.HashMap;

/* renamed from: X.Ioh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC47755Ioh {
    public int LIZ;
    public Context LIZLLL;
    public InterfaceC47775Ip1 LJ;
    public C47811Ipb LJFF;
    public int LJI;
    public HashMap<Integer, Integer> LJII;
    public Surface LJIIIIZZ;
    public SurfaceHolder LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public C46886Iag LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJJ;
    public String[] LJJ;
    public boolean LJJI;
    public int LJJIII;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public long LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public int LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJL;
    public long LJJJJL;
    public InterfaceC47896Iqy LJJJJLI;
    public int LJJJJLL;
    public boolean LJJJJZ;
    public boolean LJJJLL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public C47801IpR LJJL;
    public int LJJLI;
    public int LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJJI;
    public int LJJLIIIJL;
    public long LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public String LJJZ;
    public int LJL;
    public int LJLI;
    public int LJLIIIL;
    public boolean LJLIIL;
    public int LJLIL;
    public C47789IpF LJLILLLLZI;
    public InterfaceC47812Ipc LJLJI;
    public C47799IpP LJLJJI;
    public int LJLJJL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LJIJ = -1;
    public int LJIJI = -1;
    public String LJIJJLI = "";
    public String LJIL = "";
    public String LJJIFFI = "";
    public int LJJII = 1;
    public int LJJIIJ = -1;
    public boolean LJJJJJ = true;
    public float LJJJJZI = -1.0f;
    public float LJJJLIIL = -1.0f;
    public boolean LJJLIIIJILLIZJL = true;
    public int LJJLIIIJJIZ = 30;
    public int LJJLIL = -1;
    public int LJJLJ = -1;
    public int LJJLJLI = -1;
    public int LJJLL = -1;
    public int LJJZZI = -1;
    public int LJJZZIII = -1;
    public String LJLJJLL = "";
    public String LJLJL = "";
    public String LJLJLJ = "";

    public final boolean LJI() {
        return LJIIIIZZ(0) || LJIIIIZZ(1) || LJIIIIZZ(3) || LJIIIIZZ(4);
    }

    public final boolean LJII() {
        return LJIIIIZZ(2);
    }

    public void LJIIJ(int i) {
    }

    public void LJIIJJI(InterfaceC47775Ip1 interfaceC47775Ip1) {
    }

    public boolean LJIIL(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        return false;
    }

    public void LJIILIIL(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
    }

    public void LJIILJJIL(InterfaceC47775Ip1 interfaceC47775Ip1) {
    }

    public void LJIILL(int i, int i2) {
    }

    public void LJIILLIIL() {
    }

    public void LJIIZILJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
    }

    public final int LIZLLL() {
        InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
        if (interfaceC47775Ip1 != null) {
            return interfaceC47775Ip1.getVideoHeight();
        }
        return 0;
    }

    public final int LJ() {
        InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
        if (interfaceC47775Ip1 != null) {
            return interfaceC47775Ip1.getVideoWidth();
        }
        return 0;
    }

    public final int LJFF() {
        C47801IpR c47801IpR = this.LJJL;
        if (c47801IpR != null) {
            return c47801IpR.LIZ.LIZ();
        }
        return 0;
    }

    public final boolean LJIIIZ() {
        if (this.LJ.getPlayerType() == 0 || this.LJ.getPlayerType() == 5 || this.LJ.getPlayerType() == 3 || this.LJ.getPlayerType() == 4) {
            return true;
        }
        return false;
    }

    public final void LJIJ() {
        if (this.LJ == null) {
            return;
        }
        C47811Ipb c47811Ipb = new C47811Ipb(this);
        this.LJFF = c47811Ipb;
        this.LJ.LJIIZILJ(c47811Ipb);
        this.LJ.LJIL(this.LJFF);
        this.LJ.LJIJI(this.LJFF);
        this.LJ.LJIJJLI(this.LJFF);
        this.LJ.LJIILJJIL(this.LJFF);
        this.LJ.LJIILL(this.LJFF);
        this.LJ.LJIILLIIL(this.LJFF);
        this.LJ.LJIILIIL(this.LJFF);
    }

    public void LJIJJ() {
        float f;
        this.LJ.LJ(94, LIZ(415, this.LJJLIIIJ));
        this.LJ.LJ(98, LIZ(340, this.LJJLIIJ));
        this.LJ.LJ(261, this.LJJLIIIJL);
        boolean z = this.LJJJLL;
        InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
        if (interfaceC47775Ip1 != null) {
            if (interfaceC47775Ip1.LJI()) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                try {
                    interfaceC47775Ip1.setVolume(f, f);
                } catch (Exception unused) {
                }
            } else {
                interfaceC47775Ip1.LJIIJ(z);
            }
        }
        float f2 = this.LJJJJZI;
        if (f2 >= 0.0f) {
            float f3 = this.LJJJLIIL;
            if (f3 >= 0.0f) {
                LJIJJLI(f2, f3);
            }
        }
        if (this.LJJLIIIJLLLLLLLZ == 1) {
            this.LJ.LJ(182, this.LJJLI);
            this.LJ.LJ(181, this.LJJLIIIIJ);
        }
        if (this.LJI == 5) {
            String str = this.LJJZ;
            if (str != null) {
                this.LJ.LIZLLL(5000, str);
            }
            int i = this.LJJZZI;
            if (i >= 0) {
                this.LJ.LJ(5001, i);
            }
            int i2 = this.LJJZZIII;
            if (i2 >= 0) {
                this.LJ.LJ(5002, i2);
            }
            int i3 = this.LJL;
            if (i3 >= 0) {
                this.LJ.LJ(5003, i3);
            }
            int i4 = this.LJLI;
            if (i4 >= 0) {
                this.LJ.LJ(5004, i4);
            }
            int i5 = this.LJLIIIL;
            if (i5 >= 0) {
                this.LJ.LJ(5005, i5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LIZJ(int r6) {
        /*
            r5 = this;
            X.Ip1 r4 = r5.LJ
            r0 = 480(0x1e0, float:6.73E-43)
            r1 = -1
            if (r6 == r0) goto La6
            r3 = 3
            java.lang.String r2 = "audio"
            switch(r6) {
                case 43: goto L95;
                case 44: goto L84;
                case 45: goto L73;
                case 46: goto L62;
                case 47: goto L5f;
                case 48: goto L4c;
                case 49: goto L39;
                case 50: goto L36;
                case 51: goto L33;
                case 52: goto La9;
                case 53: goto L28;
                case 54: goto L24;
                case 55: goto L20;
                case 56: goto L1c;
                case 57: goto L18;
                default: goto Ld;
            }
        Ld:
            int r0 = r5.LJLJJL     // Catch: java.lang.Throwable -> Lac
            if (r0 <= 0) goto Lac
            X.Ipc r0 = r5.LJLJI     // Catch: java.lang.Throwable -> Lac
            int r0 = r0.LJIIIIZZ(r6)     // Catch: java.lang.Throwable -> Lac
            return r0
        L18:
            int r1 = r5.LJIIJJI     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L1c:
            int r1 = r5.LJIILIIL     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L20:
            int r1 = r5.LJIIL     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L24:
            int r1 = r5.LJIJI     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L28:
            X.IpR r0 = r5.LJJL     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lac
            X.Ipv r0 = r0.LIZ     // Catch: java.lang.Throwable -> Lac
            int r1 = r0.LIZ()     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L33:
            int r1 = r5.LJJJZ     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L36:
            int r1 = r5.LJJJLZIJ     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L39:
            android.content.Context r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lac
            java.lang.Object r0 = X.C16880lQ.LLILL(r0, r2)     // Catch: java.lang.Throwable -> Lac
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lab
            int r1 = r0.getStreamVolume(r3)     // Catch: java.lang.Throwable -> Lac
            if (r1 >= 0) goto Lac
            goto Lab
        L4c:
            android.content.Context r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lac
            java.lang.Object r0 = X.C16880lQ.LLILL(r0, r2)     // Catch: java.lang.Throwable -> Lac
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lab
            int r1 = X.C16880lQ.LLLLLLZZ(r0, r3)     // Catch: java.lang.Throwable -> Lac
            if (r1 >= 0) goto Lac
            goto Lab
        L5f:
            int r1 = r5.LJI     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L62:
            int r0 = r5.LJJLL     // Catch: java.lang.Throwable -> Lac
            if (r0 >= 0) goto L70
            if (r4 == 0) goto L70
            r0 = 140(0x8c, float:1.96E-43)
            int r0 = r4.LJIIJJI(r0, r1)     // Catch: java.lang.Throwable -> Lac
            r5.LJJLL = r0     // Catch: java.lang.Throwable -> Lac
        L70:
            int r1 = r5.LJJLL     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L73:
            int r0 = r5.LJJLJLI     // Catch: java.lang.Throwable -> Lac
            if (r0 >= 0) goto L81
            if (r4 == 0) goto L81
            r0 = 141(0x8d, float:1.98E-43)
            int r0 = r4.LJIIJJI(r0, r1)     // Catch: java.lang.Throwable -> Lac
            r5.LJJLJLI = r0     // Catch: java.lang.Throwable -> Lac
        L81:
            int r1 = r5.LJJLJLI     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L84:
            int r0 = r5.LJJLJ     // Catch: java.lang.Throwable -> Lac
            if (r0 >= 0) goto L92
            if (r4 == 0) goto L92
            r0 = 158(0x9e, float:2.21E-43)
            int r0 = r4.LJIIJJI(r0, r1)     // Catch: java.lang.Throwable -> Lac
            r5.LJJLJ = r0     // Catch: java.lang.Throwable -> Lac
        L92:
            int r1 = r5.LJJLJ     // Catch: java.lang.Throwable -> Lac
            goto Lac
        L95:
            int r0 = r5.LJJLIL     // Catch: java.lang.Throwable -> Lac
            if (r0 >= 0) goto La3
            if (r4 == 0) goto La3
            r0 = 157(0x9d, float:2.2E-43)
            int r0 = r4.LJIIJJI(r0, r1)     // Catch: java.lang.Throwable -> Lac
            r5.LJJLIL = r0     // Catch: java.lang.Throwable -> Lac
        La3:
            int r1 = r5.LJJLIL     // Catch: java.lang.Throwable -> Lac
            goto Lac
        La6:
            int r1 = r5.LJJLIIIJL     // Catch: java.lang.Throwable -> Lac
            goto Lac
        La9:
            if (r4 != 0) goto Lad
        Lab:
            r1 = 0
        Lac:
            return r1
        Lad:
            int r1 = r4.getCurrentPosition()     // Catch: java.lang.Throwable -> Lac
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47755Ioh.LIZJ(int):int");
    }

    public final boolean LJIIIIZZ(int i) {
        int i2;
        InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
        if (interfaceC47775Ip1 != null) {
            int playerType = interfaceC47775Ip1.getPlayerType();
            i2 = 2;
            if (playerType != 0) {
                if (playerType != 1) {
                    if (playerType != 2) {
                        i2 = 3;
                        if (playerType != 3) {
                            i2 = 4;
                            if (playerType != 4) {
                                i2 = 5;
                                if (playerType != 5) {
                                    throw new RuntimeException(KMP.LJ("unknown internal player type: ", playerType));
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
            }
        } else {
            i2 = this.LJI;
        }
        if (i2 != i) {
            return false;
        }
        return true;
    }

    public final void LJJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSubTag: ");
        LIZ.append(str);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        this.LIZJ = str;
    }

    public final void LJJI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTag: ");
        LIZ.append(str);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        this.LIZIZ = str;
    }

    public final void LJJIFFI(java.util.Map<Integer, Integer> map) {
        int i;
        int i2;
        if (map == null) {
            return;
        }
        int i3 = 0;
        if (this.LJI == 1) {
            i = 1;
        } else {
            i = 0;
        }
        HashMap hashMap = (HashMap) map;
        hashMap.put(2, Integer.valueOf(i));
        int i4 = this.LJI;
        if (i4 != 2 && i4 != 5) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        hashMap.put(1, Integer.valueOf(i2));
        HashMap<Integer, Integer> hashMap2 = this.LJII;
        if (this.LJI == 5) {
            i3 = 1;
        }
        hashMap2.put(26, Integer.valueOf(i3));
        hashMap.put(11, Integer.valueOf(this.LJJIII));
        hashMap.put(100, Integer.valueOf(this.LJJII));
        if (LIZ(85, this.LJJIIJ) >= 0) {
            hashMap.put(27, Integer.valueOf(LIZ(85, this.LJJIIJ)));
        }
    }

    public final int LIZ(int i, int i2) {
        if (this.LJLJJL > 0) {
            return this.LJLJI.LJIIIIZZ(i);
        }
        return i2;
    }

    public final String LIZIZ(int i, String str) {
        if (this.LJLJJL > 0) {
            return this.LJLJI.LIZIZ(i);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIJI(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.LJLJJL > 0) {
            if (i != 3) {
                if (i != 100) {
                    if (i != 117) {
                        if (i != 480) {
                            switch (i) {
                                case 5001:
                                    this.LJJZZI = i2;
                                    InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
                                    if (interfaceC47775Ip1 == null || interfaceC47775Ip1.getPlayerType() != 5) {
                                        return;
                                    }
                                    this.LJ.LJ(5001, i2);
                                    return;
                                case 5002:
                                    this.LJJZZIII = i2;
                                    InterfaceC47775Ip1 interfaceC47775Ip12 = this.LJ;
                                    if (interfaceC47775Ip12 == null || interfaceC47775Ip12.getPlayerType() != 5) {
                                        return;
                                    }
                                    this.LJ.LJ(5002, i2);
                                    return;
                                case 5003:
                                    this.LJL = i2;
                                    InterfaceC47775Ip1 interfaceC47775Ip13 = this.LJ;
                                    if (interfaceC47775Ip13 == null || interfaceC47775Ip13.getPlayerType() != 5) {
                                        return;
                                    }
                                    this.LJ.LJ(5003, i2);
                                    return;
                                case 5004:
                                    this.LJLI = i2;
                                    InterfaceC47775Ip1 interfaceC47775Ip14 = this.LJ;
                                    if (interfaceC47775Ip14 == null || interfaceC47775Ip14.getPlayerType() != 5) {
                                        return;
                                    }
                                    this.LJ.LJ(5004, i2);
                                    return;
                                case 5005:
                                    this.LJLIIIL = i2;
                                    InterfaceC47775Ip1 interfaceC47775Ip15 = this.LJ;
                                    if (interfaceC47775Ip15 == null || interfaceC47775Ip15.getPlayerType() != 5) {
                                        return;
                                    }
                                    this.LJ.LJ(5005, i2);
                                    return;
                                default:
                                    this.LJLJJI.LIZJ(this.LJLJI.LJ(i, i2));
                                    return;
                            }
                        }
                        this.LJJLIIIJL = i2;
                        this.LJJLIIIJLJLI = System.currentTimeMillis();
                        InterfaceC47775Ip1 interfaceC47775Ip16 = this.LJ;
                        if (interfaceC47775Ip16 == null) {
                            return;
                        }
                        interfaceC47775Ip16.LJ(261, i2);
                        return;
                    }
                    u.LJFF(4, i2);
                    return;
                }
                if (i2 != 0) {
                    z3 = 1;
                } else {
                    z3 = 0;
                }
                this.LJJLIIIJILLIZJL = z3;
                InterfaceC47775Ip1 interfaceC47775Ip17 = this.LJ;
                if (interfaceC47775Ip17 == null) {
                    return;
                }
                interfaceC47775Ip17.LJ(196, !z3);
                return;
            }
            this.LJJIII = i2;
            u.LJFF(11, i2);
            return;
        }
        if (i != 3) {
            if (i != 7) {
                if (i != 85) {
                    if (i != 100) {
                        if (i != 117) {
                            if (i != 340) {
                                if (i != 415) {
                                    if (i != 480) {
                                        if (i != 5010) {
                                            if (i != 27) {
                                                if (i != 28) {
                                                    switch (i) {
                                                        case 5001:
                                                            this.LJJZZI = i2;
                                                            InterfaceC47775Ip1 interfaceC47775Ip18 = this.LJ;
                                                            if (interfaceC47775Ip18 == null || interfaceC47775Ip18.getPlayerType() != 5) {
                                                                return;
                                                            }
                                                            this.LJ.LJ(5001, i2);
                                                            return;
                                                        case 5002:
                                                            this.LJJZZIII = i2;
                                                            InterfaceC47775Ip1 interfaceC47775Ip19 = this.LJ;
                                                            if (interfaceC47775Ip19 == null || interfaceC47775Ip19.getPlayerType() != 5) {
                                                                return;
                                                            }
                                                            this.LJ.LJ(5002, i2);
                                                            return;
                                                        case 5003:
                                                            this.LJL = i2;
                                                            InterfaceC47775Ip1 interfaceC47775Ip110 = this.LJ;
                                                            if (interfaceC47775Ip110 == null || interfaceC47775Ip110.getPlayerType() != 5) {
                                                                return;
                                                            }
                                                            this.LJ.LJ(5003, i2);
                                                            return;
                                                        case 5004:
                                                            this.LJLI = i2;
                                                            InterfaceC47775Ip1 interfaceC47775Ip111 = this.LJ;
                                                            if (interfaceC47775Ip111 == null || interfaceC47775Ip111.getPlayerType() != 5) {
                                                                return;
                                                            }
                                                            this.LJ.LJ(5004, i2);
                                                            return;
                                                        case 5005:
                                                            this.LJLIIIL = i2;
                                                            InterfaceC47775Ip1 interfaceC47775Ip112 = this.LJ;
                                                            if (interfaceC47775Ip112 == null || interfaceC47775Ip112.getPlayerType() != 5) {
                                                                return;
                                                            }
                                                            this.LJ.LJ(5005, i2);
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                                }
                                                this.LJJLIIIJJIZ = i2;
                                                return;
                                            }
                                            this.LJJLIIIJJI = i2;
                                            return;
                                        }
                                        if (i2 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.LJLIIL = z2;
                                        return;
                                    }
                                    this.LJJLIIIJL = i2;
                                    this.LJJLIIIJLJLI = System.currentTimeMillis();
                                    InterfaceC47775Ip1 interfaceC47775Ip113 = this.LJ;
                                    if (interfaceC47775Ip113 == null) {
                                        return;
                                    }
                                    interfaceC47775Ip113.LJ(261, i2);
                                    return;
                                }
                                this.LJJLIIIJ = i2;
                                InterfaceC47775Ip1 interfaceC47775Ip114 = this.LJ;
                                if (interfaceC47775Ip114 == null) {
                                    return;
                                }
                                interfaceC47775Ip114.LJ(94, i2);
                                return;
                            }
                            this.LJJLIIJ = i2;
                            InterfaceC47775Ip1 interfaceC47775Ip115 = this.LJ;
                            if (interfaceC47775Ip115 == null) {
                                return;
                            }
                            interfaceC47775Ip115.LJ(98, i2);
                            return;
                        }
                        u.LJFF(4, i2);
                        return;
                    }
                    if (i2 != 0) {
                        z = 1;
                    } else {
                        z = 0;
                    }
                    this.LJJLIIIJILLIZJL = z;
                    InterfaceC47775Ip1 interfaceC47775Ip116 = this.LJ;
                    if (interfaceC47775Ip116 == null) {
                        return;
                    }
                    interfaceC47775Ip116.LJ(196, !z);
                    return;
                }
                this.LJJIIJ = i2;
                return;
            }
            this.LJJLIIIJLLLLLLLZ = i2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hardware enable = ");
            LIZ.append(this.LJJLIIIJLLLLLLLZ);
            C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
            InterfaceC47775Ip1 interfaceC47775Ip117 = this.LJ;
            if (interfaceC47775Ip117 == null) {
                return;
            }
            interfaceC47775Ip117.LJ(59, i2);
            return;
        }
        this.LJJIII = i2;
        u.LJFF(11, i2);
    }

    public final void LJIJJLI(float f, float f2) {
        float f3;
        InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
        if (interfaceC47775Ip1 == null) {
            return;
        }
        if (LIZ(415, this.LJJLIIIJ) == 0 && !LJI()) {
            if (f != 0.0f) {
                f3 = 1.0f;
                f2 = 1.0f;
            } else {
                f3 = f;
            }
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(this.LIZLLL, "audio");
            if (audioManager != null) {
                audioManager.setStreamVolume(3, (int) f, 0);
            }
            f = f3;
        }
        interfaceC47775Ip1.setVolume(f, f2);
    }

    public void LJIL(int i, String str) {
        if (i != 5000) {
            if (this.LJLJJL > 0) {
                this.LJLJJI.LIZJ(this.LJLJI.LIZLLL(i, str));
            }
        } else {
            InterfaceC47775Ip1 interfaceC47775Ip1 = this.LJ;
            if (interfaceC47775Ip1 != null && interfaceC47775Ip1.getPlayerType() == 5) {
                this.LJ.LIZLLL(5000, str);
            }
            this.LJJZ = str;
        }
    }
}
