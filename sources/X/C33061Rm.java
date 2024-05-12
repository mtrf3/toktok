package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;

/* renamed from: X.1Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33061Rm implements InterfaceC13750gN {
    public static final C33061Rm LIZ = new C33061Rm();

    @Override // X.InterfaceC13750gN
    public final int LIZ(int i, CharSequence charSequence) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            break;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        return i2;
    }
}
