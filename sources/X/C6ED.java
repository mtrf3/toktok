package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;

/* renamed from: X.6ED, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ED extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ C6EC LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C68322mC<C6EX> LJLJI;
    public final /* synthetic */ PreCheckResult LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6ED(C6EC c6ec, String str, C68322mC<C6EX> c68322mC, PreCheckResult preCheckResult, int i) {
        super(1);
        this.LJLIL = c6ec;
        this.LJLILLLLZI = str;
        this.LJLJI = c68322mC;
        this.LJLJJI = preCheckResult;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue == 5) {
                        this.LJLIL.LJLZ(this.LJLJI.element);
                        if (this.LJLIL.LJJZZI().creativeModel.postPageModel.isEnterFromEPDirectly) {
                            TuxSheet tuxSheet = this.LJLIL.LLFFF;
                            if (tuxSheet != null) {
                                tuxSheet.dismiss();
                            }
                        } else {
                            this.LJLIL.Nb();
                        }
                    }
                } else {
                    this.LJLIL.LJJZZI().creativeModel.audioCopyrightDetectModel.setChangeMusicFrom(this.LJLILLLLZI);
                    this.LJLIL.LJLZ(this.LJLJI.element);
                    C6EC c6ec = this.LJLIL;
                    c6ec.LLFF = c6ec.LJLJJLL(this.LJLJJI, this.LJLILLLLZI, this.LJLJJL, this.LJLJI.element);
                }
            } else {
                this.LJLIL.LJJZZI().creativeModel.audioCopyrightDetectModel.setContinueSelected(true);
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LLFII;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        } else {
            this.LJLIL.LJJZZI().creativeModel.audioCopyrightDetectModel.setChangeMusicFrom(this.LJLILLLLZI);
            this.LJLIL.rq();
        }
        return C76800UCe.LIZ;
    }
}
