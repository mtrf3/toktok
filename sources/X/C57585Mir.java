package X;

import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.Mir, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57585Mir extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57585Mir(String str, TuxTextView tuxTextView, String str2, String str3, int i) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = tuxTextView;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = this.LJLIL;
        }
        this.LJLILLLLZI.setText(str2);
        C57582Mio.LIZ.put(C57582Mio.LIZ(this.LJLJJL, this.LJLILLLLZI.getMaxLines(), this.LJLJI, this.LJLJJI), str2);
        return C76800UCe.LIZ;
    }
}
