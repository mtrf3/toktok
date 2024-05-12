package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ph8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65122Ph8 implements InterfaceC64803Pbz {
    public InterfaceC31677Cbx<C65126PhC> LJLIL;
    public final /* synthetic */ Request LJLILLLLZI;

    @Override // X.InterfaceC64803Pbz
    public final boolean LIZIZ(long j) {
        return false;
    }

    @Override // X.InterfaceC64803Pbz
    public final void cancel() {
        InterfaceC31677Cbx<C65126PhC> interfaceC31677Cbx = this.LJLIL;
        if (interfaceC31677Cbx != null) {
            try {
                ((C65123Ph9) interfaceC31677Cbx).LIZ.cancel();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.InterfaceC64803Pbz
    public final C36910EeA execute() {
        TypedInput typedByteArray;
        String method = this.LJLILLLLZI.getMethod();
        if (!"GET".equals(method) && !"POST".equals(method)) {
            C0NB.LJ("RetrofitProvider", "REQUEST NOT GET OR POST");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<EJ6> headers = this.LJLILLLLZI.getHeaders();
        if (headers != null) {
            for (EJ6 ej6 : headers) {
                if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable() || !TextUtils.equals(ej6.LIZ, "response-format")) {
                    arrayList.add(new C05130Ib(ej6.LIZ, ej6.LIZIZ));
                }
            }
        }
        if (TextUtils.equals("GET", method)) {
            C65124PhA LIZLLL = C65124PhA.LIZLLL();
            String url = this.LJLILLLLZI.getUrl();
            Object extraInfo = this.LJLILLLLZI.getExtraInfo();
            LIZLLL.getClass();
            this.LJLIL = ((INetworkService) CN1.LIZ(INetworkService.class)).get(url, arrayList, extraInfo);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (this.LJLILLLLZI.getBody() != null) {
                this.LJLILLLLZI.getBody().writeTo(byteArrayOutputStream);
            }
            if (this.LJLILLLLZI.getBody() instanceof MultipartTypedOutput) {
                C65124PhA LIZLLL2 = C65124PhA.LIZLLL();
                int maxLength = this.LJLILLLLZI.getMaxLength();
                String url2 = this.LJLILLLLZI.getUrl();
                String mimeType = this.LJLILLLLZI.getBody().mimeType();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                long length = this.LJLILLLLZI.getBody().length();
                String md5Stub = this.LJLILLLLZI.getBody().md5Stub();
                LIZLLL2.getClass();
                this.LJLIL = C65124PhA.LJI(maxLength, url2, arrayList, mimeType, byteArray, length, md5Stub);
            } else if (this.LJLILLLLZI.getBody() != null) {
                C65124PhA LIZLLL3 = C65124PhA.LIZLLL();
                String url3 = this.LJLILLLLZI.getUrl();
                String mimeType2 = this.LJLILLLLZI.getBody().mimeType();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                Object extraInfo2 = this.LJLILLLLZI.getExtraInfo();
                LIZLLL3.getClass();
                this.LJLIL = ((INetworkService) CN1.LIZ(INetworkService.class)).post(url3, arrayList, mimeType2, byteArray2, extraInfo2);
            }
        }
        InterfaceC31677Cbx<C65126PhC> interfaceC31677Cbx = this.LJLIL;
        if (interfaceC31677Cbx == null) {
            return null;
        }
        C65126PhC LIZ = ((C65123Ph9) interfaceC31677Cbx).LIZ();
        ArrayList arrayList2 = new ArrayList();
        List<C05130Ib> list = LIZ.LIZJ;
        if (list != null) {
            for (C05130Ib c05130Ib : list) {
                arrayList2.add(new EJ6(c05130Ib.getName(), c05130Ib.getValue()));
            }
        }
        if (this.LJLILLLLZI.isResponseStreaming()) {
            typedByteArray = new C65125PhB(LIZ);
        } else {
            typedByteArray = new TypedByteArray(LIZ.LIZLLL, LIZ.LJ, new String[0]);
        }
        return new C36910EeA(LIZ.LIZ, LIZ.LIZIZ, LIZ.LJFF, arrayList2, typedByteArray);
    }

    public C65122Ph8(Request request) {
        this.LJLILLLLZI = request;
    }
}
