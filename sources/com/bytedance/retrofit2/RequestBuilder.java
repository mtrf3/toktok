package com.bytedance.retrofit2;

import X.C0ON;
import X.C64551PVb;
import X.C64552PVc;
import X.EJ6;
import X.InterfaceC64660PZg;
import X.PVP;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class RequestBuilder {
    public String LIZ;
    public final InterfaceC64660PZg LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public StringBuilder LJ;
    public String LJFF;
    public List<EJ6> LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public final FormUrlEncodedTypedOutput LJIIIZ;
    public final MultipartTypedOutput LJIIJ;
    public TypedOutput LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public Object LJIJ;
    public final C64552PVc LJIJI;
    public PVP LJIJJ;
    public boolean LJIJJLI;
    public final Map<Class<?>, Object> LJIL = new LinkedHashMap();

    /* loaded from: classes7.dex */
    public static class MimeOverridingTypedOutput extends AbsTypedOutput {
        public final TypedOutput delegate;
        public final String mimeType;

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public String fileName() {
            return this.delegate.fileName();
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
        public boolean interceptRequestBody() {
            TypedOutput typedOutput = this.delegate;
            if (typedOutput instanceof AbsTypedOutput) {
                return ((AbsTypedOutput) typedOutput).interceptRequestBody();
            }
            return false;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public long length() {
            return this.delegate.length();
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public String md5Stub() {
            return this.delegate.md5Stub();
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
        public void writeTo(OutputStream outputStream) {
            this.delegate.writeTo(outputStream);
        }

        public MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }

        @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
        public String compressRequestBody(String str, boolean z) {
            TypedOutput typedOutput = this.delegate;
            if (typedOutput instanceof AbsTypedOutput) {
                return ((AbsTypedOutput) typedOutput).compressRequestBody(str, z);
            }
            return null;
        }
    }

    public static StringBuilder LIZJ(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    public final void LIZ(String str, String str2) {
        if (str != null) {
            if ("Content-Type".equalsIgnoreCase(str)) {
                this.LJII = str2;
                return;
            }
            List list = this.LJI;
            if (list == null) {
                list = new ArrayList(2);
                this.LJI = list;
            }
            list.add(new EJ6(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name must not be null.");
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        char c;
        if (str != null) {
            try {
                StringBuilder sb = this.LJ;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.LJ = sb;
                }
                if (sb.length() > 0) {
                    c = '&';
                } else {
                    c = '?';
                }
                sb.append(c);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 == null || str2.isEmpty()) {
                    sb.append(str);
                    return;
                }
                sb.append(str);
                sb.append('=');
                sb.append(str2);
                return;
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(C0ON.LIZJ("Unable to convert query parameter \"", str, "\" value to UTF-8: ", str2), e);
            }
        }
        throw new IllegalArgumentException("Query param name must not be null.");
    }

    public RequestBuilder(String str, InterfaceC64660PZg interfaceC64660PZg, String str2, List<EJ6> list, String str3, int i, int i2, boolean z, int i3, boolean z2, Object obj, boolean z3, boolean z4, boolean z5, String str4) {
        this.LIZ = str;
        this.LIZIZ = interfaceC64660PZg;
        this.LIZLLL = str2;
        this.LJII = str3;
        this.LJIIL = i;
        this.LJIILIIL = i2;
        this.LJIILL = z;
        this.LJIILLIIL = i3;
        this.LJIIZILJ = z2;
        this.LJIJ = obj;
        this.LJIIIIZZ = z3;
        this.LJI = list;
        this.LJIILJJIL = str4;
        if (z4) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
            this.LJIIIZ = formUrlEncodedTypedOutput;
            this.LJIIJ = null;
            this.LJIIJJI = formUrlEncodedTypedOutput;
            this.LJIJI = null;
            return;
        }
        if (z5) {
            this.LJIIIZ = null;
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            this.LJIIJ = multipartTypedOutput;
            this.LJIIJJI = multipartTypedOutput;
            C64552PVc c64552PVc = new C64552PVc();
            this.LJIJI = c64552PVc;
            c64552PVc.LIZJ(C64551PVb.LJFF);
            return;
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIJI = null;
    }
}
