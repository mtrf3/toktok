package X;

/* renamed from: X.Uss, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78590Uss extends C78588Usq {
    @Override // X.C78588Usq
    public final int LJJIJIL() {
        return 2;
    }

    @Override // X.C78588Usq
    public final int LJJIJIIJIL(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0') {
            if (c <= '9') {
                sb.append((char) ((c - '0') + 4));
                return 1;
            }
            if (c >= 'a' && c <= 'z') {
                sb.append((char) ((c - 'a') + 14));
                return 1;
            }
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!') {
            if (c <= '/') {
                sb.append((char) 1);
                sb.append((char) (c - '!'));
                return 2;
            }
            if (c >= ':') {
                if (c <= '@') {
                    sb.append((char) 1);
                    sb.append((char) ((c - ':') + 15));
                    return 2;
                }
                if (c >= '[') {
                    if (c <= '_') {
                        sb.append((char) 1);
                        sb.append((char) ((c - '[') + 22));
                        return 2;
                    }
                    if (c == '`') {
                        sb.append((char) 2);
                        sb.append((char) 0);
                        return 2;
                    }
                }
                if (c >= 'A') {
                    if (c <= 'Z') {
                        sb.append((char) 2);
                        sb.append((char) ((c - 'A') + 1));
                        return 2;
                    }
                    if (c >= '{' && c <= 127) {
                        sb.append((char) 2);
                        sb.append((char) ((c - '{') + 27));
                        return 2;
                    }
                }
            }
        }
        sb.append("\u0001\u001e");
        return LJJIJIIJIL((char) (c - 128), sb) + 2;
    }
}
