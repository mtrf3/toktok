package X;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class InputConnectionC14990iN implements InputConnection {
    public final InterfaceC14880iC LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public C15010iP LIZLLL;
    public int LJ;
    public boolean LJFF;
    public final List<InterfaceC14750hz> LJI;
    public boolean LJII;

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public final boolean LIZIZ() {
        int i = this.LIZJ - 1;
        this.LIZJ = i;
        if (i == 0 && (!this.LJI.isEmpty())) {
            this.LIZ.LIZIZ(ORZ.LLJILJILJ(this.LJI));
            ((ArrayList) this.LJI).clear();
        }
        if (this.LIZJ > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.LJII;
        if (z) {
            this.LIZJ++;
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        ((ArrayList) this.LJI).clear();
        this.LIZJ = 0;
        this.LJII = false;
        this.LIZ.LIZ(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.LJII;
        if (z) {
            LIZ(new C1U4());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return LIZIZ();
    }

    public final void LIZ(InterfaceC14750hz interfaceC14750hz) {
        this.LIZJ++;
        try {
            ((ArrayList) this.LJI).add(interfaceC14750hz);
        } finally {
            LIZIZ();
        }
    }

    public final void LIZJ(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.LJII;
        if (z) {
            return this.LIZIZ;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C15010iP c15010iP = this.LIZLLL;
        return TextUtils.getCapsMode(c15010iP.LIZ.LJLIL, C08350Ul.LJ(c15010iP.LIZIZ), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C08350Ul.LIZIZ(this.LIZLLL.LIZIZ)) {
            return null;
        }
        return C44729Hgz.LJJII(this.LIZLLL).LJLIL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.LJII;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    LIZ(new C1U9(0, this.LIZLLL.LIZ.LJLIL.length()));
                    break;
                case R.id.cut:
                    LIZJ(277);
                    break;
                case R.id.copy:
                    LIZJ(278);
                    break;
                case R.id.paste:
                    LIZJ(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.LJII;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                }
                this.LIZ.LIZLLL(i2);
            }
            i2 = 1;
            this.LIZ.LIZLLL(i2);
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent event) {
        o.LJIIIZ(event, "event");
        boolean z = this.LJII;
        if (z) {
            this.LIZ.LIZJ(event);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.LJII;
        if (z) {
            LIZ(new C33711Tz(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZ(new C1U1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZ(new InterfaceC14750hz(i, i2) { // from class: X.1U2
                public final int LIZ;
                public final int LIZIZ;

                public final int hashCode() {
                    return (this.LIZ * 31) + this.LIZIZ;
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
                    LIZ.append(this.LIZ);
                    LIZ.append(", lengthAfterCursor=");
                    return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                }

                @Override // X.InterfaceC14750hz
                public final void LIZ(C14820i6 buffer) {
                    o.LJIIIZ(buffer, "buffer");
                    int i3 = this.LIZ;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        i4++;
                        if (buffer.LIZIZ > i4) {
                            char LIZIZ = buffer.LIZIZ((r0 - i4) - 1);
                            char LIZIZ2 = buffer.LIZIZ(buffer.LIZIZ - i4);
                            if (Character.isHighSurrogate(LIZIZ) && Character.isLowSurrogate(LIZIZ2)) {
                                i4++;
                            }
                        }
                        if (i4 == buffer.LIZIZ) {
                            break;
                        }
                    }
                    int i6 = this.LIZIZ;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        i7++;
                        if (buffer.LIZJ + i7 < buffer.LIZLLL()) {
                            char LIZIZ3 = buffer.LIZIZ((buffer.LIZJ + i7) - 1);
                            char LIZIZ4 = buffer.LIZIZ(buffer.LIZJ + i7);
                            if (Character.isHighSurrogate(LIZIZ3) && Character.isLowSurrogate(LIZIZ4)) {
                                i7++;
                            }
                        }
                        if (buffer.LIZJ + i7 == buffer.LIZLLL()) {
                            break;
                        }
                    }
                    int i9 = buffer.LIZJ;
                    buffer.LIZ(i9, i7 + i9);
                    int i10 = buffer.LIZIZ;
                    buffer.LIZ(i10 - i4, i10);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1U2)) {
                        return false;
                    }
                    C1U2 c1u2 = (C1U2) obj;
                    if (this.LIZ == c1u2.LIZ && this.LIZIZ == c1u2.LIZIZ) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZ = i;
                    this.LIZIZ = i2;
                    if (i >= 0 && i2 >= 0) {
                        return;
                    }
                    String LJIIJJI = C48690J9a.LJIIJJI("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.");
                    LJIIJJI.toString();
                    throw new IllegalArgumentException(LJIIJJI);
                }
            });
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.LJFF = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.LJ = i2;
        }
        return C78915Uy7.LJJIJIIJIL(this.LIZLLL);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C44729Hgz.LJJIIJ(this.LIZLLL, i).LJLIL;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C44729Hgz.LJJIIJZLJL(this.LIZLLL, i).LJLIL;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.LJII;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(final int i, final int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZ(new InterfaceC14750hz(i, i2) { // from class: X.1U7
                public final int LIZ;
                public final int LIZIZ;

                public final int hashCode() {
                    return (this.LIZ * 31) + this.LIZIZ;
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SetComposingRegionCommand(start=");
                    LIZ.append(this.LIZ);
                    LIZ.append(", end=");
                    return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                }

                @Override // X.InterfaceC14750hz
                public final void LIZ(C14820i6 buffer) {
                    o.LJIIIZ(buffer, "buffer");
                    if (buffer.LIZLLL != -1) {
                        buffer.LIZLLL = -1;
                        buffer.LJ = -1;
                    }
                    int LJIIL = C78842Uww.LJIIL(this.LIZ, 0, buffer.LIZLLL());
                    int LJIIL2 = C78842Uww.LJIIL(this.LIZIZ, 0, buffer.LIZLLL());
                    if (LJIIL != LJIIL2) {
                        if (LJIIL < LJIIL2) {
                            buffer.LJFF(LJIIL, LJIIL2);
                        } else {
                            buffer.LJFF(LJIIL2, LJIIL);
                        }
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1U7)) {
                        return false;
                    }
                    C1U7 c1u7 = (C1U7) obj;
                    if (this.LIZ == c1u7.LIZ && this.LIZIZ == c1u7.LIZIZ) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZ = i;
                    this.LIZIZ = i2;
                }
            });
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.LJII;
        if (z) {
            LIZ(new C1U8(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZ(new C1U9(i, i2));
            return true;
        }
        return z;
    }

    public InputConnectionC14990iN(C15010iP initState, C1U0 c1u0, boolean z) {
        o.LJIIIZ(initState, "initState");
        this.LIZ = c1u0;
        this.LIZIZ = z;
        this.LIZLLL = initState;
        this.LJI = new ArrayList();
        this.LJII = true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        o.LJIIIZ(inputContentInfo, "inputContentInfo");
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }
}
