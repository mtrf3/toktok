package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NlS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60294NlS extends AbstractC65781Prl implements InterfaceC88472Yns<O1I, C76800UCe> {
    public final /* synthetic */ C60292NlQ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;
    public final /* synthetic */ android.net.Uri LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60294NlS(C60292NlQ c60292NlQ, long j, InterfaceC88472Yns interfaceC88472Yns, AqS137S0200000_6 aqS137S0200000_6, android.net.Uri uri) {
        super(1);
        this.LJLIL = c60292NlQ;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = aqS137S0200000_6;
        this.LJLJJL = uri;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(O1I o1i) {
        android.net.Uri build;
        C60292NlQ c60292NlQ;
        C38934FPu c38934FPu;
        InterfaceC60311Nlj<String, Object> LJII;
        boolean z;
        O1I info = o1i;
        o.LJIIJ(info, "info");
        C60292NlQ c60292NlQ2 = this.LJLIL;
        c60292NlQ2.getClass();
        AbstractC60548NpY abstractC60548NpY = (AbstractC60548NpY) c60292NlQ2.Zf().LLLIIL(AbstractC60548NpY.class);
        if (abstractC60548NpY != null) {
            if (!(abstractC60548NpY instanceof C60549NpZ)) {
                abstractC60548NpY = null;
            }
            C60549NpZ c60549NpZ = (C60549NpZ) abstractC60548NpY;
            if (c60549NpZ != null && O1F.LIZLLL(c60549NpZ.LIZ) && (LJII = C60373Nmj.LIZIZ().LJII(c60549NpZ.LIZ)) != null) {
                if ((info instanceof O1W) && ((O1W) info).LJIJ) {
                    z = true;
                } else {
                    z = false;
                }
                LJII.putBooleanIfAbsent("res_memory", z);
            }
        }
        String str = info.LJI;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.LJLILLLLZI);
        C60203Njz c60203Njz = (C60203Njz) this.LJLIL.LLF.LIZJ(C60203Njz.class);
        if (c60203Njz != null) {
            c60203Njz.LJI = Long.valueOf(millis);
        }
        C60292NlQ c60292NlQ3 = this.LJLIL;
        c60292NlQ3.getClass();
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(c60292NlQ3, InterfaceC60276NlA.class);
        C60292NlQ c60292NlQ4 = this.LJLIL;
        C60549NpZ c60549NpZ2 = c60292NlQ4.LJLLLLLL;
        String value = c60292NlQ4.LJIL().LJJJJI.getValue();
        String LIZ = info.LIZ();
        String valueOf = String.valueOf(info.LJIIJ);
        Long valueOf2 = Long.valueOf(millis);
        if (interfaceC60276NlA != null) {
            C60547NpX c60547NpX = new C60547NpX("bdx_monitor_lynx_resource_load", null, null, 254);
            c60547NpX.LIZJ = c60549NpZ2;
            JSONObject LJ = C47135Ieh.LJ("res_from", LIZ, "res_url", str);
            LJ.put("res_version", valueOf);
            LJ.put("res_status", "success");
            LJ.put("channel", value);
            c60547NpX.LJI = LJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", valueOf2);
            c60547NpX.LJII = jSONObject;
            interfaceC60276NlA.LJ(c60547NpX);
        }
        C60292NlQ c60292NlQ5 = this.LJLIL;
        c60292NlQ5.getClass();
        InterfaceC60260Nku interfaceC60260Nku = (InterfaceC60260Nku) C60299NlX.LIZ(c60292NlQ5, InterfaceC60260Nku.class);
        if (interfaceC60260Nku != null && (c38934FPu = (c60292NlQ = this.LJLIL).LJLL) != null) {
            C37017Eft LJJII = interfaceC60260Nku.LJJII(c60292NlQ.LLF, null);
            if (LJJII != null) {
                c38934FPu.LIZ(LJJII);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.bridge.IGenericBridgeMethod");
            }
        }
        InputStream LIZIZ = info.LIZIZ();
        if (LIZIZ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        C62848OlY.LIZIZ(LIZIZ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AnonymousClass636.LJFF(byteArrayOutputStream, null);
                        AnonymousClass636.LJFF(LIZIZ, null);
                        if (byteArray != null) {
                            this.LJLIL.LLIIJI = byteArray;
                            C60292NlQ c60292NlQ6 = this.LJLIL;
                            if (info.LJIIIIZZ == EnumC60490Noc.CDN && c60292NlQ6.Zf().isDebug()) {
                                C59896Nf2 LJIL = this.LJLIL.LJIL();
                                String str2 = (String) LJIL.LJJLIIIJL.getValue();
                                if (str2 == null && (str2 = (String) LJIL.LJJJJLL.getValue()) == null && (str2 = (String) LJIL.LJJJJZI.getValue()) == null) {
                                    str2 = "";
                                }
                                build = UriProtector.parse(str2);
                            } else {
                                String str3 = info.LJI;
                                if (str3 != null) {
                                    Uri.Builder path = new Uri.Builder().scheme("local_file").authority("absolute").path(str3);
                                    o.LJFF(path, "Uri.Builder()\n    .schem…RITY_ABSOLUTE).path(path)");
                                    build = path.build();
                                    o.LJFF(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
                                } else {
                                    o.LJIIZILJ();
                                    throw null;
                                }
                            }
                            c60292NlQ6.LLIIJLIL = build;
                            this.LJLIL.LLIIZ = System.currentTimeMillis() - currentTimeMillis;
                            this.LJLJJI.invoke(this.LJLJJL);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                interfaceC88472Yns.invoke(new RuntimeException("Script decode error!", e));
            }
        } else {
            this.LJLJI.invoke(new FileNotFoundException(String.valueOf(info)));
        }
        return C76800UCe.LIZ;
    }
}
