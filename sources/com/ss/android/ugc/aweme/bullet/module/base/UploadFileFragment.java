package com.ss.android.ugc.aweme.bullet.module.base;

import X.C16880lQ;
import X.C268313n;
import X.C61878OQg;
import X.C72545SdZ;
import X.C78983UzD;
import X.OJD;
import X.ORZ;
import X.X1D;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class UploadFileFragment extends Fragment {
    public ValueCallback<Uri> LJLIL;
    public ValueCallback<Uri[]> LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final Intent vl() {
        Uri fromFile;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        StringBuilder LIZ = X1D.LIZ();
        String absolutePath = new C268313n("y+6X0e/qfIqkZDbYHfFiN/8XI5fyqrwX5d+bZ2FLxi1E6LD99U2nLfLCenyKfDw=").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getFile(UPLOAD_CACHE_DIR_TOKEN).absolutePath");
        LIZ.append(absolutePath);
        this.LJLJI = C72545SdZ.LIZLLL(LIZ, File.separator, ".jpg", LIZ);
        Context context = getContext();
        String str = this.LJLJI;
        o.LJI(str);
        File file = new File(str);
        if (context != null && Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(context.getPackageName());
            LIZ2.append(".fileprovider");
            fromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, X1D.LIZIZ(LIZ2), file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        intent.putExtra("output", fromFile);
        return intent;
    }

    public final Intent xl() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent wl = wl(vl(), new Intent("android.media.action.VIDEO_CAPTURE"), new Intent("android.provider.MediaStore.RECORD_SOUND"));
        wl.putExtra("android.intent.extra.INTENT", intent);
        return wl;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    public final Intent wl(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    public final void Al(String str, String capture) {
        List list;
        String str2;
        List list2;
        String str3 = str;
        o.LJIIIZ(capture, "capture");
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        try {
            List<String> split = new OJD(";").split(str3, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C61878OQg.INSTANCE;
            String[] strArr = (String[]) list.toArray(new String[0]);
            if (strArr.length != 0) {
                str4 = strArr[0];
            }
            if (TextUtils.isEmpty(capture)) {
                str2 = "filesystem";
            } else {
                str2 = capture;
            }
            if (o.LJ(capture, "filesystem")) {
                for (String str5 : strArr) {
                    List<String> split2 = new OJD("=").split(str5, 0);
                    if (!split2.isEmpty()) {
                        ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                        while (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                list2 = ORZ.LLILLL(split2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list2 = C61878OQg.INSTANCE;
                    String[] strArr2 = (String[]) list2.toArray(new String[0]);
                    if (strArr2.length == 2 && o.LJ("capture", strArr2[0])) {
                        str2 = strArr2[1];
                    }
                }
            }
            this.LJLJI = null;
            int hashCode = str4.hashCode();
            if (hashCode != -661257167) {
                if (hashCode != 452781974) {
                    if (hashCode == 1911932022 && str4.equals("image/*")) {
                        if (o.LJ(str2, "camera")) {
                            Intent vl = vl();
                            vl.putExtra("pns.sandbox.dataflow_id", 1207965441);
                            C16880lQ.LJIIIIZZ(this, vl);
                            return;
                        }
                        Intent wl = wl(vl());
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("image/*");
                        wl.putExtra("android.intent.extra.INTENT", intent);
                        wl.putExtra("pns.sandbox.dataflow_id", 1207965185);
                        C16880lQ.LJIIIIZZ(this, wl);
                        return;
                    }
                } else if (str4.equals("video/*")) {
                    if (o.LJ(str2, "camcorder")) {
                        Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                        intent2.putExtra("pns.sandbox.dataflow_id", 1207965442);
                        C16880lQ.LJIIIIZZ(this, intent2);
                        return;
                    }
                    Intent wl2 = wl(new Intent("android.media.action.VIDEO_CAPTURE"));
                    Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                    intent3.addCategory("android.intent.category.OPENABLE");
                    intent3.setType("video/*");
                    wl2.putExtra("android.intent.extra.INTENT", intent3);
                    wl2.putExtra("pns.sandbox.dataflow_id", 1207965185);
                    C16880lQ.LJIIIIZZ(this, wl2);
                    return;
                }
            } else if (str4.equals("audio/*")) {
                if (o.LJ(str2, "microphone")) {
                    Intent intent4 = new Intent("android.provider.MediaStore.RECORD_SOUND");
                    intent4.putExtra("pns.sandbox.dataflow_id", 1207964417);
                    C16880lQ.LJIIIIZZ(this, intent4);
                    return;
                }
                Intent wl3 = wl(new Intent("android.provider.MediaStore.RECORD_SOUND"));
                Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                intent5.addCategory("android.intent.category.OPENABLE");
                intent5.setType("audio/*");
                wl3.putExtra("android.intent.extra.INTENT", intent5);
                wl3.putExtra("pns.sandbox.dataflow_id", 1207965185);
                C16880lQ.LJIIIIZZ(this, wl3);
                return;
            }
            C16880lQ.LJIIIIZZ(this, xl());
        } catch (ActivityNotFoundException e) {
            C78983UzD.LJIIZILJ(e);
            try {
                this.LJLJJI = true;
                Intent xl = xl();
                xl.putExtra("pns.sandbox.dataflow_id", 1207965185);
                C16880lQ.LJIIIIZZ(this, xl);
            } catch (ActivityNotFoundException unused) {
            }
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r3 == null) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 2048(0x800, float:2.87E-42)
            if (r7 != r0) goto L62
            android.webkit.ValueCallback<android.net.Uri> r0 = r6.LJLIL
            if (r0 != 0) goto Lc
            android.webkit.ValueCallback<android.net.Uri[]> r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L62
        Lc:
            r5 = 0
            if (r8 != 0) goto L16
            boolean r0 = r6.LJLJJI
            if (r0 == 0) goto L16
            r6.LJLJJI = r5
            return
        L16:
            r0 = -1
            r4 = 0
            if (r9 == 0) goto L1c
            if (r8 == r0) goto L69
        L1c:
            r3 = r4
        L1d:
            if (r9 != 0) goto L45
            if (r8 != r0) goto L45
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r6.LJLJI
            kotlin.jvm.internal.o.LJI(r0)
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L45
            android.net.Uri r3 = android.net.Uri.fromFile(r1)
            android.content.Context r2 = r6.getContext()
            if (r2 == 0) goto L45
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r1.<init>(r0, r3)
            r2.sendBroadcast(r1)
        L45:
            android.webkit.ValueCallback<android.net.Uri> r0 = r6.LJLIL
            if (r0 == 0) goto L51
            kotlin.jvm.internal.o.LJI(r0)
            r0.onReceiveValue(r3)
            r6.LJLIL = r4
        L51:
            android.webkit.ValueCallback<android.net.Uri[]> r1 = r6.LJLILLLLZI
            if (r1 == 0) goto L60
            kotlin.jvm.internal.o.LJI(r1)
            if (r3 != 0) goto L63
            r0 = r4
        L5b:
            r1.onReceiveValue(r0)
            r6.LJLILLLLZI = r4
        L60:
            r6.LJLJJI = r5
        L62:
            return
        L63:
            r0 = 1
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r0[r5] = r3
            goto L5b
        L69:
            android.net.Uri r3 = r9.getData()
            if (r3 != 0) goto L45
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment.onActivityResult(int, int, android.content.Intent):void");
    }
}
