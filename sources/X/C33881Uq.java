package X;

import android.content.ClipData;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.1Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33881Uq implements InterfaceC16170kH {
    public final ClipData LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public android.net.Uri LIZLLL;
    public Bundle LJ;

    @Override // X.InterfaceC16170kH
    public final C16190kJ build() {
        return new C16190kJ(new InterfaceC16180kI(this) { // from class: X.1Us
            public final ClipData LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final android.net.Uri LIZLLL;
            public final Bundle LJ;

            @Override // X.InterfaceC16180kI
            public final ContentInfo LIZIZ() {
                return null;
            }

            public final String toString() {
                String str;
                String valueOf;
                String LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ContentInfoCompat{clip=");
                LIZ.append(this.LIZ.getDescription());
                LIZ.append(", source=");
                int i = this.LIZIZ;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                LIZ.append(str);
                LIZ.append(", flags=");
                int i2 = this.LIZJ;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                LIZ.append(valueOf);
                String str2 = "";
                if (this.LIZLLL == null) {
                    LIZIZ = "";
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(", hasLinkUri(");
                    LIZ2.append(this.LIZLLL.toString().length());
                    LIZ2.append(")");
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                LIZ.append(LIZIZ);
                if (this.LJ != null) {
                    str2 = ", hasExtras";
                }
                return JBR.LJFF(LIZ, str2, "}", LIZ);
            }

            @Override // X.InterfaceC16180kI
            public final ClipData LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC16180kI
            public final int LLLLLLLLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC16180kI
            public final int getSource() {
                return this.LIZIZ;
            }

            {
                ClipData clipData = this.LIZ;
                clipData.getClass();
                this.LIZ = clipData;
                int i = this.LIZIZ;
                TMC.LJII(i, 0, 5, "source");
                this.LIZIZ = i;
                int i2 = this.LIZJ;
                if ((i2 & 1) == i2) {
                    this.LIZJ = i2;
                    this.LIZLLL = this.LIZLLL;
                    this.LJ = this.LJ;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Requested flags 0x");
                    LIZ.append(Integer.toHexString(i2));
                    LIZ.append(", but only 0x");
                    LIZ.append(Integer.toHexString(1));
                    LIZ.append(" are allowed");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            }
        });
    }

    @Override // X.InterfaceC16170kH
    public final void LIZ(android.net.Uri uri) {
        this.LIZLLL = uri;
    }

    @Override // X.InterfaceC16170kH
    public final void LIZIZ(int i) {
        this.LIZJ = i;
    }

    @Override // X.InterfaceC16170kH
    public final void setExtras(Bundle bundle) {
        this.LJ = bundle;
    }

    public C33881Uq(ClipData clipData, int i) {
        this.LIZ = clipData;
        this.LIZIZ = i;
    }
}
