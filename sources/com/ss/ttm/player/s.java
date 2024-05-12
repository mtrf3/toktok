package com.ss.ttm.player;

import X.C46886Iag;
import X.C47811Ipb;
import X.InterfaceC47775Ip1;
import X.InterfaceC48414IzK;
import X.InterfaceC48415IzL;
import X.InterfaceC48416IzM;
import X.InterfaceC48417IzN;
import X.InterfaceC48418IzO;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.util.Map;

/* loaded from: classes9.dex */
public class s implements InterfaceC47775Ip1 {
    @Override // X.InterfaceC47775Ip1
    public final void LIZ(FileDescriptor fileDescriptor, long j, long j2) {
    }

    @Override // X.InterfaceC47775Ip1
    public final String LIZIZ(int i) {
        return null;
    }

    @Override // X.InterfaceC47775Ip1
    public final int LIZJ(float f, int i) {
        return -1;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LIZLLL(int i, String str) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJ(int i, int i2) {
    }

    @Override // X.InterfaceC47775Ip1
    public final long LJFF(int i, long j) {
        return -1L;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJII(IMediaDataSource iMediaDataSource) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIIZ(Context context, Uri uri) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIJ(boolean z) {
    }

    @Override // X.InterfaceC47775Ip1
    public final int LJIIJJI(int i, int i2) {
        return i2;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIL(int i, int i2) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILIIL(C47811Ipb c47811Ipb) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILJJIL(InterfaceC48415IzL interfaceC48415IzL) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILL(C47811Ipb c47811Ipb) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILLIIL(InterfaceC48418IzO interfaceC48418IzO) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIZILJ(InterfaceC48417IzN interfaceC48417IzN) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJ(Context context, Uri uri, Map<String, String> map) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJI(C47811Ipb c47811Ipb) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJJ(String str) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJJLI(InterfaceC48414IzK interfaceC48414IzK) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIL(InterfaceC48416IzM interfaceC48416IzM) {
    }

    @Override // X.InterfaceC47775Ip1
    public final int getCurrentPosition() {
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getDuration() {
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final float getFloatOption(int i, float f) {
        return f;
    }

    @Override // X.InterfaceC47775Ip1
    public final long getLongOption(int i, long j) {
        return j;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getPlayerType() {
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getVideoHeight() {
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getVideoWidth() {
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean isMute() {
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final void pause() {
    }

    @Override // X.InterfaceC47775Ip1
    public final void prepareAsync() {
    }

    @Override // X.InterfaceC47775Ip1
    public final void release() {
    }

    @Override // X.InterfaceC47775Ip1
    public final void reset() {
    }

    @Override // X.InterfaceC47775Ip1
    public final void seekTo(int i) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void setDisplay(SurfaceHolder surfaceHolder) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void setLooping(boolean z) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void setPlaybackParams(C46886Iag c46886Iag) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void setVolume(float f, float f2) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void start() {
    }

    @Override // X.InterfaceC47775Ip1
    public final void stop() {
    }

    static {
        TTVersion.LIZ();
    }

    @Override // X.InterfaceC47775Ip1
    public final void setSurface(Surface surface) {
        if (surface != null) {
            surface.isValid();
        }
    }
}
