package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.android.live.broadcast.mirror.message.DualCameraStateMessage;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32871Qt implements InterfaceC277016w {
    public int LJLIL = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
    public int LJLILLLLZI = 480;
    public final /* synthetic */ C12750el LJLJI;

    public C32871Qt(C12750el c12750el) {
        this.LJLJI = c12750el;
    }

    public static boolean LIZ(String str) {
        try {
            GlUtil.checkNoGLES2Error("drawer is error.");
            return false;
        } catch (Throwable th) {
            C0NB.LJFF("GameDualDeviceStrategy", str, th);
            return true;
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJII(final String str) {
        C0NB.LJIIL("GameDualDeviceStrategy", "onCast start");
        if (str != null) {
            final C12750el c12750el = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CastRender_");
            LIZ.append(str);
            final SurfaceTextureHelper create = SurfaceTextureHelper.create(X1D.LIZIZ(LIZ));
            if (create == null) {
                c12750el.getClass();
                C0JV.LJ(2005, c12750el.LIZLLL(), 3, "mix_stream", "create textureHelper failed");
            }
            final C12740ek c12740ek = new C12740ek(create);
            c12750el.LJIIIIZZ.put(str, c12740ek);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("id: ");
            LIZ2.append(str);
            C0NB.LIZIZ("GameDualDeviceStrategy", X1D.LIZIZ(LIZ2));
            if (create != null) {
                C90552ZgK.LIZIZ().LJI(10021, str, new Surface(create.getSurfaceTexture()));
                create.startListening(new SurfaceTextureHelper.OnTextureFrameAvailableListener() { // from class: X.1Qs
                    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
                    public final void onTextureFrameAvailable(final int i, float[] fArr, long j) {
                        boolean z;
                        IInputVideoStream iInputVideoStream = C12750el.this.LIZ.LJLLI.get(str);
                        C12750el c12750el2 = C12750el.this;
                        EnumC12710eh enumC12710eh = c12750el2.LIZLLL;
                        if (enumC12710eh != null) {
                            Boolean LJJZZIII = C276716t.LJ.LJJZZIII();
                            if (LJJZZIII == null) {
                                LJJZZIII = Boolean.FALSE;
                            }
                            o.LJIIIIZZ(LJJZZIII, "GameCastLink.isSmall.value ?: false");
                            boolean booleanValue = LJJZZIII.booleanValue();
                            Boolean LJJZZIII2 = C276716t.LIZLLL.LJJZZIII();
                            if (LJJZZIII2 == null) {
                                LJJZZIII2 = Boolean.FALSE;
                            }
                            o.LJIIIIZZ(LJJZZIII2, "GameCastLink.isLand.value ?: false");
                            RectF rectPort$default = EnumC12710eh.getRectPort$default(enumC12710eh, booleanValue, LJJZZIII2.booleanValue(), 0.0f, 4, null);
                            if (iInputVideoStream != null) {
                                VideoMixer.VideoMixerDescription mixerDescription = iInputVideoStream.getMixerDescription();
                                if (mixerDescription != null) {
                                    mixerDescription.top = rectPort$default.top;
                                    mixerDescription.bottom = rectPort$default.bottom;
                                    mixerDescription.left = rectPort$default.left;
                                    mixerDescription.right = rectPort$default.right;
                                    mixerDescription.alpha = -1.0f;
                                    mixerDescription.setEnableAlphaMode(true);
                                    iInputVideoStream.setMixerDescription(mixerDescription);
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("call back last: ");
                                    LIZ3.append(mixerDescription.hashCode());
                                    LIZ3.append("， new: ");
                                    LIZ3.append(mixerDescription.hashCode());
                                    C0NB.LJIIIZ("GameDualDeviceStrategy", X1D.LIZIZ(LIZ3));
                                    c12750el2.LJFF = mixerDescription;
                                    c12750el2.LIZLLL = null;
                                }
                            }
                            create.returnTextureFrame();
                        }
                        if (iInputVideoStream != null) {
                            try {
                                final C32871Qt c32871Qt = this;
                                final C12740ek c12740ek2 = c12740ek;
                                Handler handler = create.getHandler();
                                o.LJIIIIZZ(handler, "handler");
                                C32871Qt c32871Qt2 = this;
                                final int i2 = c32871Qt2.LJLIL;
                                final int i3 = c32871Qt2.LJLILLLLZI;
                                c32871Qt.getClass();
                                final C76732zl c76732zl = new C76732zl();
                                c76732zl.element = -1;
                                ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: X.0em
                                    public final /* synthetic */ int LJLJI = 0;
                                    public final /* synthetic */ int LJLJJI = 0;
                                    public final /* synthetic */ boolean LJLJL = true;

                                    public final void LIZ() {
                                        GlTextureFrameBuffer glTextureFrameBuffer;
                                        int i4;
                                        C12740ek c12740ek3 = C12740ek.this;
                                        if (c12740ek3.LIZIZ == null) {
                                            c12740ek3.LIZIZ = new GlRenderDrawer();
                                            C12740ek.this.LIZJ = new GlTextureFrameBuffer(6408);
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("GlTextureFrameBuffer Init is error");
                                            C32871Qt c32871Qt3 = c32871Qt;
                                            int i5 = c32871Qt3.LJLIL;
                                            int i6 = c32871Qt3.LJLILLLLZI;
                                            Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(createBitmap);
                                            canvas.drawColor(0);
                                            Paint paint = new Paint();
                                            paint.setColor(-1);
                                            paint.setStyle(Paint.Style.FILL);
                                            paint.setAntiAlias(true);
                                            float f = i5;
                                            float f2 = i6;
                                            canvas.drawRoundRect(0.0f, 0.0f, f, f2, 72.0f, 72.0f, paint);
                                            paint.setStyle(Paint.Style.STROKE);
                                            paint.setStrokeWidth(8.0f);
                                            paint.setColor(-16777216);
                                            float f3 = 1;
                                            float f4 = 4.0f - f3;
                                            canvas.drawRoundRect(f4, f4, (f - 4.0f) + f3, (f2 - 4.0f) + f3, 72.0f, 72.0f, paint);
                                            C12740ek c12740ek4 = C12740ek.this;
                                            c32871Qt.getClass();
                                            if (createBitmap == null) {
                                                C0NB.LJ("GameBroadcastFragment", "loadTextureByBitmap，load bitmap error, check the file path is correct!");
                                                i4 = 0;
                                            } else {
                                                int[] iArr = new int[1];
                                                GLES20.glGenTextures(1, iArr, 0);
                                                int i7 = iArr[0];
                                                if (i7 != 0) {
                                                    GLES20.glBindTexture(3553, i7);
                                                    GLES20.glTexParameteri(3553, 10240, 9729);
                                                    GLES20.glTexParameteri(3553, 10241, 9729);
                                                    GLES20.glTexParameteri(3553, 10242, 33071);
                                                    GLES20.glTexParameteri(3553, 10243, 33071);
                                                    GLUtils.texImage2D(3553, 0, 6408, createBitmap, 0);
                                                }
                                                if (iArr[0] == 0) {
                                                    C0NB.LJ("GameBroadcastFragment", "loadTextureByBitmap, the texture id is 0!");
                                                }
                                                i4 = iArr[0];
                                            }
                                            c12740ek4.LIZLLL = i4;
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("bitmap load is error");
                                        }
                                        GlTextureFrameBuffer glTextureFrameBuffer2 = C12740ek.this.LIZJ;
                                        if (glTextureFrameBuffer2 == null) {
                                            return;
                                        }
                                        if (glTextureFrameBuffer2.getHeight() != c32871Qt.LJLILLLLZI || glTextureFrameBuffer2.getWidth() != c32871Qt.LJLIL) {
                                            try {
                                                C32871Qt c32871Qt4 = c32871Qt;
                                                glTextureFrameBuffer2.setSize(c32871Qt4.LJLIL, c32871Qt4.LJLILLLLZI);
                                            } catch (Exception e) {
                                                glTextureFrameBuffer2.release();
                                                C12740ek.this.LIZJ = null;
                                                StringBuilder LIZ4 = X1D.LIZ();
                                                LIZ4.append("textureFrameBuffer setSize failed (");
                                                LIZ4.append(e.getMessage());
                                                LIZ4.append(") w ");
                                                LIZ4.append(c32871Qt.LJLIL);
                                                LIZ4.append(" h ");
                                                LIZ4.append(c32871Qt.LJLILLLLZI);
                                                C0NB.LJ("GameBroadcastFragment", X1D.LIZIZ(LIZ4));
                                                return;
                                            }
                                        }
                                        c32871Qt.getClass();
                                        C32871Qt.LIZ("setSize is error");
                                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer2.getFrameBufferId());
                                        try {
                                            GlUtil.checkNoGLES2Error("drawer is error.");
                                            GLES20.glEnable(3042);
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("glEnable is error");
                                            GLES20.glBlendFunc(770, 0);
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("glBlendFunc is error");
                                            C12740ek c12740ek5 = C12740ek.this;
                                            GlRenderDrawer glRenderDrawer = c12740ek5.LIZIZ;
                                            if (glRenderDrawer != null) {
                                                glRenderDrawer.drawRgb(c12740ek5.LIZLLL, null, null, this.LJLJI, this.LJLJJI, i2, i3);
                                            }
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("drawRgb mask is error");
                                            GLES20.glBlendFuncSeparate(774, 775, 0, 1);
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("glBlendFunc 2 is error");
                                            if (this.LJLJL) {
                                                GlRenderDrawer glRenderDrawer2 = C12740ek.this.LIZIZ;
                                                if (glRenderDrawer2 != null) {
                                                    glRenderDrawer2.drawOes(i, null, null, this.LJLJI, this.LJLJJI, i2, i3);
                                                }
                                            } else {
                                                GlRenderDrawer glRenderDrawer3 = C12740ek.this.LIZIZ;
                                                if (glRenderDrawer3 != null) {
                                                    glRenderDrawer3.drawRgb(i, null, null, this.LJLJI, this.LJLJJI, i2, i3);
                                                }
                                            }
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("drawOes bg is error");
                                            GLES20.glDisable(3042);
                                            GLES20.glFlush();
                                            GLES20.glFinish();
                                            c32871Qt.getClass();
                                            C32871Qt.LIZ("glFlush mask is error");
                                            GLES20.glBindFramebuffer(36160, 0);
                                            c32871Qt.getClass();
                                            if (!C32871Qt.LIZ("Drawer is error with ignore frame") && (glTextureFrameBuffer = C12740ek.this.LIZJ) != null) {
                                                c76732zl.element = glTextureFrameBuffer.getTextureId();
                                            }
                                        } catch (Throwable th) {
                                            StringBuilder LIZ5 = X1D.LIZ();
                                            LIZ5.append("glBindFramebuffer error (");
                                            LIZ5.append(th.getMessage());
                                            LIZ5.append(") fb ");
                                            LIZ5.append(glTextureFrameBuffer2.getFrameBufferId());
                                            LIZ5.append(" w ");
                                            LIZ5.append(glTextureFrameBuffer2.getWidth());
                                            LIZ5.append(" h ");
                                            LIZ5.append(glTextureFrameBuffer2.getHeight());
                                            C0NB.LJ("GameBroadcastFragment", X1D.LIZIZ(LIZ5));
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean LIZ4;
                                        try {
                                            LIZ();
                                        } finally {
                                            if (LIZ4) {
                                            }
                                        }
                                    }
                                });
                                int i4 = c76732zl.element;
                                if (i4 > 0) {
                                    z = false;
                                } else {
                                    i4 = i;
                                    z = true;
                                }
                                C32871Qt c32871Qt3 = this;
                                iInputVideoStream.pushVideoFrame(i4, z, c32871Qt3.LJLIL, c32871Qt3.LJLILLLLZI, 0, fArr, j / 1000);
                            } catch (Exception e) {
                                C0NB.LJ("GameDualDeviceStrategy", android.util.Log.getStackTraceString(e));
                            }
                        }
                        create.returnTextureFrame();
                    }
                });
            }
            c12750el.LIZIZ(str);
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJIIIIZZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCast stop, stopReason: ");
        LIZ.append(i);
        C0NB.LJIIL("GameDualDeviceStrategy", X1D.LIZIZ(LIZ));
        C12750el c12750el = this.LJLJI;
        C12740ek remove = c12750el.LJIIIIZZ.remove(str);
        if (remove != null) {
            SurfaceTextureHelper surfaceTextureHelper = remove.LIZ;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
            }
            SurfaceTextureHelper surfaceTextureHelper2 = remove.LIZ;
            if (surfaceTextureHelper2 != null) {
                surfaceTextureHelper2.dispose();
            }
        }
        IInputVideoStream remove2 = c12750el.LIZ.LJLLI.remove(str);
        if (remove2 != null) {
            try {
                remove2.stop();
                remove2.release();
            } catch (Exception e) {
                C0NB.LJ("GameServiceStrategy", android.util.Log.getStackTraceString(e));
            }
        }
        if (i == 3) {
            this.LJLJI.LIZJ().LJ = 3;
            C0JV.LJFF(this.LJLJI.LIZLLL(), "disconnect_result", 2008, Integer.valueOf(i), null, 16);
        } else {
            this.LJLJI.LIZJ().LJ = 0;
            C0JV.LJFF(this.LJLJI.LIZLLL(), "disconnect_result", 2004, Integer.valueOf(i), null, 16);
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJIILJJIL(String str, String str2) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        C0JW.LIZ.getClass();
        C15D LJ = C0JW.LJ(str2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dualDeviceMessage = ");
        LIZ.append(LJ);
        LIZ.append(", clientID: ");
        LIZ.append(str);
        C0NB.LJIIIZ("GameDualDeviceStrategy", X1D.LIZIZ(LIZ));
        if (LJ instanceof DualCameraStateMessage) {
            C12750el c12750el = this.LJLJI;
            boolean z = true;
            if (((DualCameraStateMessage) LJ).cameraState != 1) {
                z = false;
            }
            c12750el.LJIIJJI = z;
            c12750el.LJI(0, z);
            C12750el c12750el2 = this.LJLJI;
            boolean z2 = c12750el2.LJIIJJI;
            StringBuilder LJI = JBR.LJI("handleCameraStateChange: state:", z2, ", isLiving: ");
            LJI.append(c12750el2.LJ(null));
            C0NB.LIZIZ("GameDualDeviceStrategy", X1D.LIZIZ(LJI));
            if (!c12750el2.LJ(null)) {
                return;
            }
            if (z2) {
                for (String str3 : c12750el2.LJIIIIZZ.keySet()) {
                    if (str3 != null) {
                        VideoMixer.VideoMixerDescription videoMixerDescription = c12750el2.LJFF;
                        if (videoMixerDescription == null) {
                            return;
                        }
                        c12750el2.LIZ(str3, videoMixerDescription);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("top: ");
                        VideoMixer.VideoMixerDescription videoMixerDescription2 = c12750el2.LJFF;
                        if (videoMixerDescription2 != null) {
                            f = Float.valueOf(videoMixerDescription2.top);
                        } else {
                            f = null;
                        }
                        LIZ2.append(f);
                        LIZ2.append(", left: ");
                        VideoMixer.VideoMixerDescription videoMixerDescription3 = c12750el2.LJFF;
                        if (videoMixerDescription3 != null) {
                            f2 = Float.valueOf(videoMixerDescription3.left);
                        } else {
                            f2 = null;
                        }
                        LIZ2.append(f2);
                        LIZ2.append(" right: ");
                        VideoMixer.VideoMixerDescription videoMixerDescription4 = c12750el2.LJFF;
                        if (videoMixerDescription4 != null) {
                            f3 = Float.valueOf(videoMixerDescription4.right);
                        } else {
                            f3 = null;
                        }
                        LIZ2.append(f3);
                        LIZ2.append(" bottom: ");
                        VideoMixer.VideoMixerDescription videoMixerDescription5 = c12750el2.LJFF;
                        if (videoMixerDescription5 != null) {
                            f4 = Float.valueOf(videoMixerDescription5.bottom);
                        } else {
                            f4 = null;
                        }
                        LIZ2.append(f4);
                        C0NB.LJ("GameDualDeviceStrategy", X1D.LIZIZ(LIZ2));
                    }
                }
                return;
            }
            C37691dt c37691dt = c12750el2.LIZ;
            Iterator<String> it = c37691dt.LJLLI.keySet().iterator();
            while (it.hasNext()) {
                IInputVideoStream remove = c37691dt.LJLLI.remove(it.next());
                if (remove != null) {
                    try {
                        remove.stop();
                        remove.release();
                    } catch (Exception e) {
                        C0NB.LJ("GameServiceStrategy", android.util.Log.getStackTraceString(e));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJIIIZ(int i, int i2, String str) {
        boolean z;
        long j;
        Long l;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        Object obj = null;
        if (this.LJLJI.LJ(null)) {
            DataChannel dataChannel = this.LJLJI.LIZJ;
            if (dataChannel != null) {
                obj = dataChannel.kv0(GameBroadcastStateChannel.class);
            }
            if (obj == CWI.StateConnected) {
                z = true;
            } else {
                z = false;
            }
            DataChannel dataChannel2 = this.LJLJI.LIZJ;
            if (dataChannel2 != null && (l = (Long) dataChannel2.kv0(BD5.class)) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            C276716t.LIZLLL(j, z);
        }
        if (this.LJLIL != 640 || this.LJLILLLLZI != 480) {
            C12750el c12750el = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("size change castWidth=");
            LIZ.append(this.LJLIL);
            LIZ.append(",castHeight=");
            LIZ.append(this.LJLILLLLZI);
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12750el.getClass();
            C0JV.LJ(2005, c12750el.LIZLLL(), 3, "mix_stream", LIZIZ);
        }
    }
}
