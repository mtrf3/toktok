package Y;

import X.AnonymousClass636;
import X.C36322ENi;
import X.C36323ENj;
import X.C36953Eer;
import X.C37619Epb;
import X.C38776FJs;
import X.C73433Srt;
import X.C77321UWf;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.PVC;
import android.content.res.AssetManager;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDuS318S0100000_6 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C36953Eer> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS318S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS318S0100000_6 iDuS318S0100000_6, InterfaceC73573Su9 interfaceC73573Su9) {
        BufferedReader bufferedReader;
        try {
            C36953Eer c36953Eer = new C36953Eer();
            InputStream open = ((AssetManager) iDuS318S0100000_6.l0).open("10k_dark_web_filtered.txt");
            o.LJIIIIZZ(open, "assetManager.open(FILE_PATH)");
            Reader inputStreamReader = new InputStreamReader(open, PVC.LIZ);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
            }
            try {
                Iterator it = C77321UWf.LJIIJJI(bufferedReader).iterator();
                while (it.hasNext()) {
                    c36953Eer.LIZ((String) it.next());
                }
                AnonymousClass636.LJFF(bufferedReader, null);
                c36953Eer.LIZIZ.set(true);
                interfaceC73573Su9.onNext(c36953Eer);
            } finally {
            }
        } catch (IOException e) {
            interfaceC73573Su9.tryOnError(new Throwable(e.getMessage()));
        }
    }

    public static final void subscribe$1(IDuS318S0100000_6 iDuS318S0100000_6, InterfaceC73573Su9 interfaceC73573Su9) {
        C36322ENi c36322ENi = (C36322ENi) iDuS318S0100000_6.l0;
        c36322ENi.getClass();
        interfaceC73573Su9.onNext(C38776FJs.LJIIL().LIZJ(c36322ENi.LIZ, C36323ENj.class, "update_params"));
    }

    public static final void subscribe$2(IDuS318S0100000_6 iDuS318S0100000_6, InterfaceC73573Su9 interfaceC73573Su9) {
        Integer valueOf = Integer.valueOf(((C37619Epb) iDuS318S0100000_6.l0).LIZ);
        C37619Epb c37619Epb = (C37619Epb) iDuS318S0100000_6.l0;
        ChooseMusicApi.LJFF(valueOf, c37619Epb.LIZIZ, c37619Epb.LIZJ, c37619Epb.LIZLLL, c37619Epb.LJ, "", null).LIZLLL(new AgS109S0200000_6((C73433Srt) interfaceC73573Su9, (C37619Epb) iDuS318S0100000_6.l0, 3));
    }
}
