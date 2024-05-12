package X;

/* renamed from: X.Usr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78589Usr extends C78588Usq {
    @Override // X.C78588Usq
    public final int LJJIJIL() {
        return 3;
    }

    @Override // X.C78588Usq, X.InterfaceC78568UsW
    public final void LJJIFFI(C78593Usv c78593Usv) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c78593Usv.LIZJ()) {
                break;
            }
            char LIZIZ = c78593Usv.LIZIZ();
            c78593Usv.LJFF++;
            LJJIJIIJIL(LIZIZ, sb);
            if (sb.length() % 3 == 0) {
                C78588Usq.LJJIJLIJ(c78593Usv, sb);
                if (C78939UyV.LJJJI(c78593Usv.LJFF, 3, c78593Usv.LIZ) != 3) {
                    c78593Usv.LJI = 0;
                    break;
                }
            }
        }
        LJJIJL(c78593Usv, sb);
    }

    @Override // X.C78588Usq
    public final int LJJIJIIJIL(char c, StringBuilder sb) {
        if (c != '\r') {
            if (c != ' ') {
                if (c != '*') {
                    if (c != '>') {
                        if (c >= '0') {
                            if (c <= '9') {
                                sb.append((char) ((c - '0') + 4));
                            } else if (c >= 'A' && c <= 'Z') {
                                sb.append((char) ((c - 'A') + 14));
                            }
                        }
                        C78939UyV.LJJIIJZLJL(c);
                        throw null;
                    }
                    sb.append((char) 2);
                } else {
                    sb.append((char) 1);
                }
            } else {
                sb.append((char) 3);
            }
        } else {
            sb.append((char) 0);
        }
        return 1;
    }

    @Override // X.C78588Usq
    public final void LJJIJL(C78593Usv c78593Usv, StringBuilder sb) {
        c78593Usv.LIZLLL(c78593Usv.LIZ());
        int LIZ = c78593Usv.LJII.LIZIZ - c78593Usv.LIZ();
        c78593Usv.LJFF -= sb.length();
        if ((c78593Usv.LIZ.length() - c78593Usv.LJIIIIZZ) - c78593Usv.LJFF > 1 || LIZ > 1 || (c78593Usv.LIZ.length() - c78593Usv.LJIIIIZZ) - c78593Usv.LJFF != LIZ) {
            c78593Usv.LJ((char) 254);
        }
        if (c78593Usv.LJI < 0) {
            c78593Usv.LJI = 0;
        }
    }
}
