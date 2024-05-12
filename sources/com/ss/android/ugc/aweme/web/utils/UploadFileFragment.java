package com.ss.android.ugc.aweme.web.utils;

import X.C16880lQ;
import X.C59830Ndy;
import X.C61115Nyh;
import X.C61184Nzo;
import X.C61878OQg;
import X.C62005OVd;
import X.EF7;
import X.JBR;
import X.OJD;
import X.ORZ;
import X.X1D;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
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
        File LLIIJI = C16880lQ.LLIIJI(EF7.LIZIZ(), Environment.DIRECTORY_DCIM);
        if (LLIIJI == null) {
            LLIIJI = new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), Environment.DIRECTORY_DCIM);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LLIIJI.getAbsolutePath());
        String str = File.separator;
        File file = new File(JBR.LJFF(LIZ, str, "browser-photos", LIZ));
        file.mkdirs();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getAbsolutePath());
        LIZ2.append(str);
        LIZ2.append(System.currentTimeMillis());
        LIZ2.append(".jpg");
        this.LJLJI = X1D.LIZIZ(LIZ2);
        Context context = getContext();
        String str2 = this.LJLJI;
        o.LJI(str2);
        File file2 = new File(str2);
        if (context != null && Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(context.getPackageName());
            LIZ3.append(".fileprovider");
            fromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, X1D.LIZIZ(LIZ3), file2);
        } else {
            fromFile = Uri.fromFile(file2);
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

    public final void Dl(String str, String capture) {
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
                            C16880lQ.LJIIIZ(this, vl);
                            return;
                        }
                        Intent wl = wl(vl());
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("image/*");
                        wl.putExtra("android.intent.extra.INTENT", intent);
                        wl.putExtra("pns.sandbox.dataflow_id", 1207965185);
                        C16880lQ.LJIIIZ(this, wl);
                        return;
                    }
                } else if (str4.equals("video/*")) {
                    if (o.LJ(str2, "camcorder")) {
                        Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                        intent2.putExtra("pns.sandbox.dataflow_id", 1207965442);
                        C16880lQ.LJIIIZ(this, intent2);
                        return;
                    }
                    Intent wl2 = wl(new Intent("android.media.action.VIDEO_CAPTURE"));
                    Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                    intent3.addCategory("android.intent.category.OPENABLE");
                    intent3.setType("video/*");
                    wl2.putExtra("android.intent.extra.INTENT", intent3);
                    wl2.putExtra("pns.sandbox.dataflow_id", 1207965185);
                    C16880lQ.LJIIIZ(this, wl2);
                    return;
                }
            } else if (str4.equals("audio/*")) {
                if (o.LJ(str2, "microphone")) {
                    Intent intent4 = new Intent("android.provider.MediaStore.RECORD_SOUND");
                    intent4.putExtra("pns.sandbox.dataflow_id", 1207964417);
                    C16880lQ.LJIIIZ(this, intent4);
                    return;
                }
                Intent wl3 = wl(new Intent("android.provider.MediaStore.RECORD_SOUND"));
                Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                intent5.addCategory("android.intent.category.OPENABLE");
                intent5.setType("audio/*");
                wl3.putExtra("android.intent.extra.INTENT", intent5);
                wl3.putExtra("pns.sandbox.dataflow_id", 1207965185);
                C16880lQ.LJIIIZ(this, wl3);
                return;
            }
            C16880lQ.LJIIIZ(this, xl());
        } catch (ActivityNotFoundException e) {
            try {
                this.LJLJJI = true;
                Intent xl = xl();
                xl.putExtra("pns.sandbox.dataflow_id", 1207965185);
                C16880lQ.LJIIIZ(this, xl);
            } catch (ActivityNotFoundException unused) {
                C16880lQ.LLLLIIL(e);
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public final boolean Al(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z;
        Context context;
        String[] strArr;
        boolean z2;
        String str;
        if (fileChooserParams == null) {
            return false;
        }
        Context context2 = getContext();
        C62005OVd c62005OVd = C61184Nzo.LIZ;
        if (c62005OVd.LIZLLL(context2) == 0 && c62005OVd.LIZJ(getContext()) == 0 && c62005OVd.LJ(getContext()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (C61184Nzo.LIZ(context) == 0 && z) {
            this.LJLILLLLZI = valueCallback;
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            o.LJIIIIZZ(acceptTypes, "fileChooserParams.acceptTypes");
            if (acceptTypes.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                str = "";
            } else {
                str = fileChooserParams.getAcceptTypes()[0];
            }
            Dl(str, "");
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        } else {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C61115Nyh.LIZJ(mo49getActivity(), strArr, new C59830Ndy(this, valueCallback, fileChooserParams));
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
    
        if (r3 == null) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.utils.UploadFileFragment.onActivityResult(int, int, android.content.Intent):void");
    }
}
