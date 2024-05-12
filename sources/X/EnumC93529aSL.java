package X;

import com.google.ar.core.exceptions.AnchorNotSupportedForHostingException;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.CloudAnchorsNotConfiguredException;
import com.google.ar.core.exceptions.DataInvalidFormatException;
import com.google.ar.core.exceptions.DataUnsupportedVersionException;
import com.google.ar.core.exceptions.DeadlineExceededException;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException;
import com.google.ar.core.exceptions.ImageInsufficientQualityException;
import com.google.ar.core.exceptions.LocationPermissionNotGrantedException;
import com.google.ar.core.exceptions.MetadataNotFoundException;
import com.google.ar.core.exceptions.MissingGlContextException;
import com.google.ar.core.exceptions.NotTrackingException;
import com.google.ar.core.exceptions.NotYetAvailableException;
import com.google.ar.core.exceptions.PlaybackFailedException;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.SessionNotPausedException;
import com.google.ar.core.exceptions.SessionPausedException;
import com.google.ar.core.exceptions.SessionUnsupportedException;
import com.google.ar.core.exceptions.TextureNotSetException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.ar.core.exceptions.UnsupportedConfigurationException;

/* renamed from: X.aSL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC93529aSL {
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS(0, null),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_INVALID_ARGUMENT(-1, IllegalArgumentException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_FATAL(-2, FatalException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SESSION_PAUSED(-3, SessionPausedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SESSION_NOT_PAUSED(-4, SessionNotPausedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NOT_TRACKING(-5, NotTrackingException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_TEXTURE_NOT_SET(-6, TextureNotSetException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_MISSING_GL_CONTEXT(-7, MissingGlContextException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_UNSUPPORTED_CONFIGURATION(-8, UnsupportedConfigurationException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_LOCATION_PERMISSION_NOT_GRANTED(-21, LocationPermissionNotGrantedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_GOOGLE_PLAY_SERVICES_LOCATION_LIBRARY_NOT_LINKED(-22, GooglePlayServicesLocationLibraryNotLinkedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    EF140("ERROR_CAMERA_PERMISSION_NOT_GRANTED", "Camera permission is not granted", -9),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_DEADLINE_EXCEEDED(-10, DeadlineExceededException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_RESOURCE_EXHAUSTED(-11, ResourceExhaustedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NOT_YET_AVAILABLE(-12, NotYetAvailableException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CAMERA_NOT_AVAILABLE(-13, CameraNotAvailableException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING(-16, AnchorNotSupportedForHostingException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_IMAGE_INSUFFICIENT_QUALITY(-17, ImageInsufficientQualityException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_DATA_INVALID_FORMAT(-18, DataInvalidFormatException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_DATA_UNSUPPORTED_VERSION(-19, DataUnsupportedVersionException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_ILLEGAL_STATE(-20, IllegalStateException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_RECORDING_FAILED(-23, RecordingFailedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PLAYBACK_FAILED(-24, PlaybackFailedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SESSION_UNSUPPORTED(-25, SessionUnsupportedException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_METADATA_NOT_FOUND(-26, MetadataNotFoundException.class),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CLOUD_ANCHORS_NOT_CONFIGURED(-14, CloudAnchorsNotConfiguredException.class),
    /* JADX INFO: Fake field, exist only in values array */
    EF365("ERROR_INTERNET_PERMISSION_NOT_GRANTED", "Internet permission is not granted", -15),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE_ARCORE_NOT_INSTALLED(-100, UnavailableArcoreNotInstalledException.class),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE_DEVICE_NOT_COMPATIBLE(-101, UnavailableDeviceNotCompatibleException.class),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE_APK_TOO_OLD(-103, UnavailableApkTooOldException.class),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE_SDK_TOO_OLD(-104, UnavailableSdkTooOldException.class),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE_USER_DECLINED_INSTALLATION(-105, UnavailableUserDeclinedInstallationException.class);

    public final int LJLIL;
    public final Class<? extends Exception> LJLILLLLZI;
    public final String LJLJI;

    EnumC93529aSL(int i, Class cls) {
        this(r7, null, i);
    }

    EnumC93529aSL(String str, String str2, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = r2;
        this.LJLJI = str2;
    }
}
