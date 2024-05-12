package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEConstant$CODEC_ID;

/* loaded from: classes8.dex */
public final class HMS extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, Integer, C76800UCe> {
    public final /* synthetic */ HMO LJLIL;
    public final /* synthetic */ MediaModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HMS(HMO hmo, MediaModel mediaModel, boolean z, long j, long j2, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns2, long j3, String str, String str2) {
        super(2);
        this.LJLIL = hmo;
        this.LJLILLLLZI = mediaModel;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88472Yns2;
        this.LJLJLJ = j3;
        this.LJLJLLL = str;
        this.LJLL = str2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, Integer num2) {
        int i;
        int i2;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (intValue != 0) {
            HMT hmt = new HMT(this.LJLIL.LIZ);
            hmt.LIZIZ = this.LJLIL.LIZJ;
            HMW.LIZIZ(hmt, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, false, false, this.LJLJJLL, this.LJLJL, 48);
        } else {
            MediaModel mediaModel = this.LJLILLLLZI;
            int i3 = mediaModel.width;
            int i4 = mediaModel.height;
            if (i3 < i4) {
                i = i4;
            } else {
                i = i3;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            boolean z = false;
            if (i3 > 1100) {
                if (C52243Ket.LIZ()) {
                    if (TextUtils.equals(this.LJLIL.LIZLLL, "enter_from_multi")) {
                        i2 = -8;
                    } else if (!C44982Hl4.LIZ() && !C19N.LJ("enable_bytevc1_hw_decoder", false) && intValue2 != VEConstant$CODEC_ID.AV_CODEC_ID_H264.ordinal()) {
                        i2 = -7;
                    } else if (i3 > 2160 || i > 4096) {
                        i2 = -10;
                    } else {
                        HMO.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJLJ, this.LJLJLLL, this.LJLJL);
                    }
                    InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns = this.LJLJL;
                    this.LJLIL.getClass();
                    interfaceC88472Yns.invoke(new C43933HMb(i2, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LJLJLJ, this.LJLJLLL, "", false));
                } else {
                    InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns2 = this.LJLJL;
                    this.LJLIL.getClass();
                    interfaceC88472Yns2.invoke(new C43933HMb(-5, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LJLJLJ, this.LJLJLLL, "", false));
                }
            } else {
                if (TextUtils.equals("video/mp4", this.LJLL) || TextUtils.equals("video/quicktime", this.LJLL)) {
                    z = true;
                }
                if (intValue2 == VEConstant$CODEC_ID.AV_CODEC_ID_H264.ordinal() && z) {
                    InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns3 = this.LJLJJLL;
                    this.LJLIL.getClass();
                    interfaceC88472Yns3.invoke(new C43933HMb(0, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LJLJLJ, this.LJLJLLL, "", true));
                } else {
                    HMO.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJLJ, this.LJLJLLL, this.LJLJL);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
