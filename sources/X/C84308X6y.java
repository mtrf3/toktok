package X;

import android.os.Build;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.X6y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84308X6y extends X74 {
    public C84309X6z[] LJLIL;
    public final ZipFile LJLILLLLZI;
    public final X78 LJLJI;
    public final /* synthetic */ C84306X6w LJLJJI;

    @Override // X.X74
    public final X7A LIZ() {
        return new X7A(LIZJ());
    }

    @Override // X.X74
    public final X71 LIZIZ() {
        return new X70(this);
    }

    public final C84309X6z[] LIZJ() {
        String[] supportedAbis;
        int i;
        if (this.LJLIL == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(this.LJLJJI.LJIIIIZZ);
            if (Build.VERSION.SDK_INT >= 23) {
                supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
            } else {
                supportedAbis = SysUtil.LollipopSysdeps.getSupportedAbis();
            }
            Enumeration<? extends ZipEntry> entries = this.LJLILLLLZI.entries();
            while (true) {
                i = 0;
                if (!entries.hasMoreElements()) {
                    break;
                }
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = compile.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    while (true) {
                        if (i >= supportedAbis.length) {
                            break;
                        }
                        String str = supportedAbis[i];
                        if (str != null && group.equals(str)) {
                            if (i >= 0) {
                                linkedHashSet.add(group);
                                C84309X6z c84309X6z = (C84309X6z) hashMap.get(group2);
                                if (c84309X6z == null || i < c84309X6z.LJLJJI) {
                                    hashMap.put(group2, new C84309X6z(group2, nextElement, i));
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            X78 x78 = this.LJLJI;
            linkedHashSet.toArray(new String[linkedHashSet.size()]);
            x78.getClass();
            C84309X6z[] c84309X6zArr = (C84309X6z[]) hashMap.values().toArray(new C84309X6z[hashMap.size()]);
            Arrays.sort(c84309X6zArr);
            int i2 = 0;
            for (int i3 = 0; i3 < c84309X6zArr.length; i3++) {
                C84309X6z c84309X6z2 = c84309X6zArr[i3];
                ZipEntry zipEntry = c84309X6z2.LJLJI;
                String str2 = c84309X6z2.LJLIL;
                C84305X6v c84305X6v = (C84305X6v) this;
                String name = zipEntry.getName();
                if (str2.equals(c84305X6v.LJLJL.LJ)) {
                    c84305X6v.LJLJL.LJ = null;
                    C16880lQ.LLLZ("allowing consideration of corrupted lib %s", new Object[]{str2});
                } else if ((c84305X6v.LJLJJLL & 1) == 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("allowing consideration of ");
                    LIZ.append(name);
                    LIZ.append(": self-extraction preferred");
                    X1D.LIZIZ(LIZ);
                } else {
                    File file = new File(c84305X6v.LJLJJL, str2);
                    try {
                        if (!file.getCanonicalPath().startsWith(c84305X6v.LJLJJL.getCanonicalPath())) {
                            C16880lQ.LLLZ("not allowing consideration of %s: %s not in lib dir", new Object[]{name, str2});
                        } else if (!file.isFile()) {
                            C16880lQ.LLLZ("allowing consideration of %s: %s not in system lib dir", new Object[]{name, str2});
                        } else {
                            long length = file.length();
                            long size = zipEntry.getSize();
                            if (length != size) {
                                C16880lQ.LLLZ("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("not allowing consideration of ");
                                LIZ2.append(name);
                                LIZ2.append(": deferring to libdir");
                                X1D.LIZIZ(LIZ2);
                            }
                        }
                    } catch (IOException e) {
                        C16880lQ.LLLZ("not allowing consideration of %s: %s, IOException when constructing path: %s", new Object[]{name, str2, e.toString()});
                    }
                    c84309X6zArr[i3] = null;
                }
                i2++;
            }
            C84309X6z[] c84309X6zArr2 = new C84309X6z[i2];
            int i4 = 0;
            while (i < c84309X6zArr.length) {
                C84309X6z c84309X6z3 = c84309X6zArr[i];
                if (c84309X6z3 != null) {
                    c84309X6zArr2[i4] = c84309X6z3;
                    i4++;
                }
                i++;
            }
            this.LJLIL = c84309X6zArr2;
        }
        return this.LJLIL;
    }

    @Override // X.X74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLILLLLZI.close();
    }

    public C84308X6y(C84306X6w c84306X6w, X78 x78) {
        this.LJLJJI = c84306X6w;
        this.LJLILLLLZI = new ZipFile(c84306X6w.LJII);
        this.LJLJI = x78;
    }
}
