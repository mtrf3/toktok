package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumServiceImpl;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS29S0301000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.UWf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77321UWf implements InterfaceC80606VkI, InterfaceC47471Ik7 {
    public static String LJLIL = "https://mon-va.tiktokv.com";
    public static Method LJLILLLLZI;
    public static boolean LJLJI;

    public static void LJIIIIZZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7934515741786406903")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC47471Ik7
    public boolean isEnabled() {
        return true;
    }

    public static InterfaceC38394F5a LJIIIZ(Context context) {
        C40659FxX c40659FxX;
        synchronized (C37111EhP.class) {
            if (C37111EhP.LIZ == null) {
                new C0FT();
                Context LLLLL = C16880lQ.LLLLL(context);
                if (LLLLL != null) {
                    context = LLLLL;
                }
                C37111EhP.LIZ = new C40659FxX(new C40647FxL(context));
            }
            c40659FxX = C37111EhP.LIZ;
        }
        return c40659FxX.LIZ.a();
    }

    public static final InterfaceC1039145z LJIIJJI(BufferedReader bufferedReader) {
        C77324UWi c77324UWi = new C77324UWi(bufferedReader);
        if (c77324UWi instanceof F3W) {
            return c77324UWi;
        }
        return new F3W(c77324UWi);
    }

    public static final List LJIILIIL(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C78886Uxe.LJJLIIIJJIZ((MediaModel) it.next()));
        }
        return arrayList;
    }

    public static final String LJIILJJIL(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[FileUtils.BUFFER_SIZE];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        o.LJIIIIZZ(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @Override // X.InterfaceC80606VkI
    public void LIZ(YS4 ys4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(ys4);
        LIZ.append(" is attach");
        LLog.LIZLLL(2, "LynxVideoAttachListener", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC47471Ik7
    public String LIZIZ(String str) {
        return IVT.LIZ(str);
    }

    @Override // X.InterfaceC47471Ik7
    public boolean LIZJ(String str) {
        return IVT.LIZIZ(str);
    }

    @Override // X.InterfaceC80606VkI
    public void LJII(YS4 ys4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(ys4);
        LIZ.append(" is detach");
        LLog.LIZLLL(2, "LynxVideoAttachListener", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
    public static final boolean LIZLLL(Aweme aweme, boolean z) {
        String region;
        if (aweme == null || (region = aweme.getRegion()) == null || region.length() == 0 || aweme.isAd() || !C175276uJ.LIZJ()) {
            return false;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = C77322UWg.LIZ;
        ?? r0 = (Object[]) LIZLLL.LJIIIIZZ("comment_photo_abandon_regions", String[].class, strArr);
        if (r0 != 0) {
            strArr = r0;
        }
        if (ORY.LJJIJIIJIL(aweme.getRegion(), strArr) || z) {
            return false;
        }
        return true;
    }

    public static final void LJ(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        IExternalAlbumService LIZJ = AlbumServiceImpl.LIZJ();
        Context requireContext = fragment.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        C16880lQ.LJII(fragment, LIZJ.LIZIZ(requireContext, i, i), i);
        Y87.LJII();
    }

    public static final void LJIIJ(Reader reader, InterfaceC88472Yns interfaceC88472Yns) {
        BufferedReader bufferedReader = (BufferedReader) reader;
        try {
            Iterator it = LJIIJJI(bufferedReader).iterator();
            while (it.hasNext()) {
                interfaceC88472Yns.invoke(it.next());
            }
            AnonymousClass636.LJFF(bufferedReader, null);
        } finally {
        }
    }

    @Override // X.InterfaceC80606VkI
    public void LJI(YS4 ys4, boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(ys4);
            LIZ.append(" is visible");
            LLog.LIZLLL(2, "LynxVideoAttachListener", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(ys4);
        LIZ2.append(" is invisible");
        LLog.LIZLLL(2, "LynxVideoAttachListener", X1D.LIZIZ(LIZ2));
    }

    public static final void LJFF(C8W0 assem, int i, InterfaceC88473Ynt interfaceC88473Ynt) {
        o.LJIIIZ(assem, "assem");
        Context context = assem.getContext();
        if (context == null) {
            return;
        }
        C212428Vi.LJFF(assem, assem, AlbumServiceImpl.LIZJ().LIZIZ(context, i, i), i, null, interfaceC88473Ynt);
        Y87.LJII();
    }

    public static final void LJIIL(Fragment fragment, boolean z, int i, InterfaceC65784Pro interfaceC65784Pro) {
        if (fragment.getContext() == null) {
            return;
        }
        if (z) {
            Context context = fragment.getContext();
            if (context == null) {
                return;
            }
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LJFF(context.getResources().getString(R.string.dig));
            LIZ.LIZIZ(context.getResources().getString(R.string.dif));
            UC0.LIZJ(LIZ, new AqS29S0301000_3(context, fragment, i, 1));
            LIZ.LIZJ(new AqS167S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 214));
            LIZ.LJII = false;
            LIZ.LJI().LIZLLL();
            return;
        }
        LJ(i, fragment);
    }
}
