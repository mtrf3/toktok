package X;

import com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl;
import fjb.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$writeLabelToAMECapabilities$2", f = "TiktokEffectCreatePipelineImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ams, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94802ams extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Object>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ TiktokEffectCreatePipelineImpl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94802ams(String str, Integer num, TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, InterfaceC67352kd<? super C94802ams> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJI = tiktokEffectCreatePipelineImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94802ams(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        JSONObject jSONObject;
        C141335gf.LIZJ(obj);
        String str2 = this.LJLIL;
        if (str2 == null) {
            return null;
        }
        Integer num = this.LJLILLLLZI;
        TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        LIZ.append(File.separator);
        LIZ.append("capabilities.json");
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("label file path ");
        LIZ2.append(LIZIZ);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
        try {
            File file = new File(LIZIZ);
            FileReader fileReader = new FileReader(file);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read();
                if (read == -1) {
                    break;
                }
                stringBuffer.append((char) read);
            }
            fileReader.close();
            inputStreamReader.close();
            str = stringBuffer.toString();
            o.LJIIIIZZ(str, "sb.toString()");
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            str = null;
        }
        if (str != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = null;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("label file content ");
        LIZ3.append(jSONObject);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ3));
        if (jSONObject != null) {
            jSONObject.put("icon_edit_TT", num);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("label file finish content ");
        LIZ4.append(str);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ4));
        if (jSONObject == null) {
            return null;
        }
        try {
            String jSONObject2 = jSONObject.toString(1);
            o.LJIIIIZZ(jSONObject2, "jsonObject.toString(1)");
            return new Long(TiktokEffectCreatePipelineImpl.writeFile$default(tiktokEffectCreatePipelineImpl, LIZIZ, jSONObject2, false, false, 12, null));
        } catch (Exception e2) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("label write file error ");
            LIZ5.append(e2);
            H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ5));
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
