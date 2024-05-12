package com.ss.android.ugc.aweme.livewallpaper;

import X.AV1;
import X.C16880lQ;
import X.C31137CJx;
import X.C31268COy;
import X.C56672Kh;
import X.C62011OVj;
import X.C62016OVo;
import X.F7X;
import X.FAK;
import X.InterfaceC31139CJz;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class WallPaperDataProvider extends ContentProvider {
    public static final String LJLJI = "com.zhiliaoapp.musically.wallpapercaller";
    public static final Uri LJLJJI;
    public static final Uri LJLJJL;
    public static final Uri LJLJJLL;
    public UriMatcher LJLIL;
    public Handler LJLILLLLZI;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C56672Kh.LIZ().LIZLLL("WallPaperDataProvider");
        this.LJLIL = new UriMatcher(-1);
        String str = LJLJI;
        if (!TextUtils.isEmpty(str)) {
            this.LJLIL.addURI(str, "ab_info", 145);
            this.LJLIL.addURI(str, "wallpaper_json", 144);
            this.LJLIL.addURI(str, "video_path", 16);
            this.LJLIL.addURI(str, "fall_back_video_path", 32);
            this.LJLIL.addURI(str, "set_wp_result", 48);
            this.LJLIL.addURI(str, "video_width", 64);
            this.LJLIL.addURI(str, "video_height", 80);
            this.LJLIL.addURI(str, "source", 96);
            this.LJLIL.addURI(str, "volume", 112);
            this.LJLIL.addURI(str, "need_tighten", 128);
        }
        this.LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "WallPaperDataProvider");
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("content://");
        LIZ.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ.append("/");
        LIZ.append("video_path");
        UriProtector.parse(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("content://");
        LIZ2.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ2.append("/");
        LIZ2.append("video_width");
        UriProtector.parse(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("content://");
        LIZ3.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ3.append("/");
        LIZ3.append("video_height");
        UriProtector.parse(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("content://");
        LIZ4.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ4.append("/");
        LIZ4.append("ab_info");
        UriProtector.parse(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("content://");
        LIZ5.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ5.append("/");
        LIZ5.append("wallpaper_json");
        LJLJJI = UriProtector.parse(X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("content://");
        LIZ6.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ6.append("/");
        LIZ6.append("fall_back_video_path");
        LJLJJL = UriProtector.parse(X1D.LIZIZ(LIZ6));
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("content://");
        LIZ7.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ7.append("/");
        LIZ7.append("set_wp_result");
        LJLJJLL = UriProtector.parse(X1D.LIZIZ(LIZ7));
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("content://");
        LIZ8.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ8.append("/");
        LIZ8.append("source");
        UriProtector.parse(X1D.LIZIZ(LIZ8));
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("content://");
        LIZ9.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ9.append("/");
        LIZ9.append("volume");
        UriProtector.parse(X1D.LIZIZ(LIZ9));
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("content://");
        LIZ10.append("com.zhiliaoapp.musically.wallpapercaller");
        LIZ10.append("/");
        LIZ10.append("need_tighten");
        UriProtector.parse(X1D.LIZIZ(LIZ10));
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        UriMatcher uriMatcher = this.LJLIL;
        if (uriMatcher == null) {
            return "";
        }
        int match = uriMatcher.match(uri);
        if (match != 16) {
            if (match != 32) {
                if (match != 64) {
                    if (match != 80) {
                        if (match != 96) {
                            if (match != 112) {
                                if (match != 128) {
                                    if (match != 144) {
                                        if (match != 145) {
                                            return "";
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            for (InterfaceC31139CJz interfaceC31139CJz : (InterfaceC31139CJz[]) F7X.LIZ.getValue()) {
                                                String key = interfaceC31139CJz.getKey();
                                                interfaceC31139CJz.getValue();
                                                jSONObject.put(key, "true");
                                                ((Keva) C31137CJx.LIZ.getValue()).storeString(key, "true");
                                            }
                                            String jSONObject2 = jSONObject.toString();
                                            o.LJIIIIZZ(jSONObject2, "abJsonObject.toString()");
                                            return jSONObject2;
                                        } catch (Throwable unused) {
                                            return "";
                                        }
                                    }
                                    return C31137CJx.LIZ(C31268COy.LJI.LIZLLL);
                                }
                                return String.valueOf(AV1.LJIILLIIL());
                            }
                            return String.valueOf(C31268COy.LJI.LIZLLL.getVolume());
                        }
                        return C31268COy.LJI.LIZLLL.getSource();
                    }
                    return String.valueOf(C31268COy.LJI.LIZLLL.getHeight());
                }
                return String.valueOf(C31268COy.LJI.LIZLLL.getWidth());
            }
            return C31268COy.LJI.LIZLLL.getVideoPath();
        }
        return C31268COy.LJI.LIZLLL.getVideoPath();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        UriMatcher uriMatcher;
        if (contentValues == null || contentValues.size() == 0 || (uriMatcher = this.LJLIL) == null || uriMatcher.match(uri) != 48) {
            return null;
        }
        this.LJLILLLLZI.post(new ARunnableS41S0100000_5(contentValues, 195));
        return null;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String videoPath;
        UriMatcher uriMatcher = this.LJLIL;
        if (uriMatcher == null) {
            return null;
        }
        int match = uriMatcher.match(uri);
        if (match != 16) {
            if (match != 32) {
                videoPath = "";
            } else {
                videoPath = C62011OVj.LIZ();
            }
        } else {
            videoPath = C31268COy.LJI.LIZLLL.getVideoPath();
        }
        try {
            return ParcelFileDescriptor.open(new File(videoPath), 268435456);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        str.getClass();
        if (str.equals("update_preferences") && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("wallpaper_preferences"));
                boolean optBoolean = jSONObject.optBoolean("enablePauseVideo", false);
                int optInt = jSONObject.optInt("soundProgress", 0);
                C62016OVo.LIZ().storeBoolean("keva_key_enable_double_tap_pause_video", optBoolean);
                C62016OVo.LIZ().storeInt("keva_key_wallpaper_sound_slider_progress", optInt);
            } catch (Exception unused) {
            }
        }
        return bundle;
    }
}
