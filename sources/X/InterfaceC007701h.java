package X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;

/* renamed from: X.01h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC007701h extends IInterface {
    PlaybackStateCompat LJIIZILJ();

    Bundle LLLLLLJ();

    void LLLLLLL();

    long LLLLLLLLL();

    void LLLLLLLLLL(android.net.Uri uri, Bundle bundle);

    void LLLLLLLZIL(int i);

    void LLLLLLZ();

    void LLLLLLZZ();

    boolean LLLLLZ();

    CharSequence LLLLLZIL();

    void LLLLLZL(boolean z);

    ParcelableVolumeInfo LLLLZ();

    void LLLLZI(Bundle bundle, String str);

    void LLLLZIL();

    boolean LLLLZLL(KeyEvent keyEvent);

    void LLLLZLLIL(MediaDescriptionCompat mediaDescriptionCompat, int i);

    void LLLLZLLLI();

    void LLLZ(Bundle bundle, String str);

    void LLLZI(long j);

    void LLLZIIL(int i);

    void LLLZIL(RatingCompat ratingCompat);

    void LLLZL(float f);

    void LLLZLL();

    void LLLZLZ();

    PendingIntent LLLZZ();

    void LLLZZIL(RatingCompat ratingCompat, Bundle bundle);

    void LLZ(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void LLZIL(InterfaceC007601g interfaceC007601g);

    void LLZILL(InterfaceC007601g interfaceC007601g);

    void LLZL(int i, int i2);

    void S(MediaDescriptionCompat mediaDescriptionCompat);

    void U(MediaDescriptionCompat mediaDescriptionCompat);

    void Y(int i, int i2);

    void c0();

    Bundle getExtras();

    MediaMetadataCompat getMetadata();

    String getPackageName();

    String getTag();

    void k();

    void next();

    void pause();

    void play();

    void prepare();

    void previous();

    void r(Bundle bundle, String str);

    void r0(int i);

    void seekTo(long j);

    void stop();

    void t0(Bundle bundle, String str);

    void w(Bundle bundle, String str);

    void x(android.net.Uri uri, Bundle bundle);
}
